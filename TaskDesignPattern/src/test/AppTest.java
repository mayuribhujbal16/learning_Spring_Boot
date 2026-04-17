package test;

public class AppTest {

	public static void main(String[] args) 
	{
		
/*		//Setter
  
		TotalAmount ta = new TotalAmount();
		ta.setAtm(new Withdrawal());
		ta.checkAmount(100);

*/		
		//Constructor
		
		TotalAmount ta = new TotalAmount(new Deposite());
	//	ta.setAtm(new Withdrawal());
		ta.checkAmount(100);

	}

}
