package tutorials;

public class CheckingAccount {
	
	private int account_number;
	private double balance=0;
	
	public CheckingAccount(int acctNum) {
		this.account_number = acctNum;
	}
	
	public int getAccountNum() {
		return this.account_number;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double amt) {
		this.balance+=amt;
		System.out.println("Current Balance: "+this.balance +" after depositing: "+amt);
	}
	
	public void withdraw(double amt) throws InsufficientFundsException {
		if (amt > this.balance) {
			throw new InsufficientFundsException(amt - this.balance);
		}
		
		this.balance -= amt;
		System.out.println("Current Balance: "+this.balance +" after withdrawing: "+amt);
	}
public static void main(String[] args) throws InsufficientFundsException {
	try {
		CheckingAccount c1 = new CheckingAccount(123);
		c1.deposit(500);
		c1.withdraw(100);
		c1.withdraw(1000);
	}catch (Exception e) {
		System.out.println("Exception::"+e);
		e.getStackTrace();
	}
	}
	
}
