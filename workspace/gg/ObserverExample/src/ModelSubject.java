import java.util.Random;


public class ModelSubject  extends Subject {
	
		public static final int State_Wuerfeln = 1;
		public static final int State_Ziehen = 2;
		public static final int State_Fertig = 3;
		
		private Random rand = new Random();
		int gewuerfelteZahl;
		int zaehler = 0;
		
		public int getGewuerfelteZahl() {
			return gewuerfelteZahl;
		}


		public ModelSubject(){
			this.setState(ModelSubject.State_Wuerfeln);
		}
		
		public void wuerfeln (){
			this.gewuerfelteZahl = rand.nextInt(6)+1;
			if (gewuerfelteZahl == 3){
				setState(State_Ziehen);
			}
			else setState(State_Wuerfeln);
		} 

		public void ziehen() {
			zaehler = zaehler+1;
			if (zaehler == 5){
				setState( State_Fertig);
			}
			else setState(State_Wuerfeln);
		}

		public void fertig() {
			System.exit(0);
			
		}
		

}
