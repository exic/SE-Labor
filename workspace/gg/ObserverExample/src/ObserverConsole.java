import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObserverConsole implements IObserver { 

	private ModelSubject ms;
	private Controller ct;
	

	public ObserverConsole(ModelSubject m) {
		this.ms = m;
		this.ms.attach(this);
		this.ct = new Controller(m, this);
		initComponents();
	}
;

	private void initComponents() {
		System.out.println("aktueller Zustand: " );
        if (ms.getState() == ModelSubject.State_Wuerfeln) {
        	System.out.println("Wuerfeln");
        }
        getInput();
	}


	private void getInput() {
		String str = new String();
		while (true) {
			
    	System.out.println("bitte Aktion eingeben ( wuerfeln -w , ziehen - z, fertig - f):");
		try{
    		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    		str = in.readLine();
		}
			catch(IOException e){}
		if (str.equals("w")) { ct.controlActionStates("wuerfeln");}
		if (str.equals("z")) { ct.controlActionStates("ziehen");}
		if (str.equals("f")) { ct.controlActionStates("fertig");}
		}
	}
	
	
	public void update(Subject o) 
	{  
		System.out.println("Update received from Subject, state changed to : " + o.getState());
        if (o.getState() == ModelSubject.State_Wuerfeln) {
        	System.out.println("Zustand: Wuerfeln");
        	System.out.println("gewuerfelt: " +  ms.getGewuerfelteZahl());
        }
        if (o.getState() == ModelSubject.State_Ziehen) {
        	System.out.println("Zustand: Ziehen");
        	System.out.println("gewuerfelt: " + ms.getGewuerfelteZahl());
        }
        if (o.getState() == ModelSubject.State_Fertig) {
        	System.out.println("Zustand: Fertig");
        }
	
	}


}
