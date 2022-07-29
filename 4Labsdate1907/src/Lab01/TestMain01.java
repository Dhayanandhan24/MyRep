package Lab01;

public class TestMain01 {
public static void main (String args[]) {
	
	Account details1 = new Account(38920, "Rakesh");
	SavingsAccount details2 = new SavingsAccount(38920, "Rakesh", 70785.7);
	
	
	System.out.println("Account Id: "+ details1.getAccId());
	System.out.println("Account NAME: "+ details1.getAccName());
	System.out.println("Account BALANCE: "+ details2.getBalance());
	
}

}
