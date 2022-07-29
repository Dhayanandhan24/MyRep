package Lab01;

public class SavingsAccount extends Account {
	private double balance;
	

	public SavingsAccount(int accId, String accName, double balance) {
		super (accId,accName);
		this.balance = balance;
	}

	
	public double getBalance() {
		
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
