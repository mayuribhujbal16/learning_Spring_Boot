package test;

public class Deposite implements Atm
{
	@Override
	public void pay(int ammount)
	{
		System.out.println("Deposite amount: " +ammount+ " rs");
	}


}
