package tutorials;

public class InsufficientFundsException extends Exception
{
	private double amount;
	public InsufficientFundsException(double amount) 
	{
		this.amount = amount;
		System.out.println("Need: "+this.amount+" more in your account");
	}

}
