
public class Controller  {
	boolean run = true;
	ModelSubject sModel;
	IObserver view;
	
	
	public Controller(ModelSubject sm, IObserver vo){
		this.sModel = sm;
		this.view = vo;
	}
	

	
	public void controlActionStates(String action) {
		
		if (action.equals("wuerfeln")&&(this.sModel.getState()== ModelSubject.State_Wuerfeln))
		{
			System.out.println("Systemoperation ist wuerfeln");
			sModel.wuerfeln();
		}
		if (action.equals("ziehen")&&(this.sModel.getState()== ModelSubject.State_Ziehen))
		{
			System.out.println("Systemoperation ist ziehen");
			sModel.ziehen();
		}
		if (action.equals("fertig")&&(this.sModel.getState()== ModelSubject.State_Fertig))
		{
			System.out.println("Systemoperation ist fertig");
			sModel.fertig();
		}

	}

}
