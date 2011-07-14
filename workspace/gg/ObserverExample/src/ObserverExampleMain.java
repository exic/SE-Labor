
public class ObserverExampleMain

{ 
	public static void main(String[] args) {
		ModelSubject sModel = new ModelSubject();   
		new ObserverGUI(sModel).setVisible(true); 	//grafische oberflaeche
		//new ObserverConsole(sModel);				//Konsoleneingabe
	}
}



