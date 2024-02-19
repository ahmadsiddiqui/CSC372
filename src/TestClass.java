
public class TestClass {
	public static void main(String args[]) {
		CheckingAccount ca = new CheckingAccount();
		ca.setFirstName("John");
		ca.setLastName("Smith");
		ca.setAccountID(314159);
		ca.setInterestRate(3);
		
		ca.deposit(1000);
		
		System.out.println("A $1000 deposit was made.");
		
		ca.displayAccount();
		
		ca.processWithdrawal(1100);
		
		System.out.println("A withdrawal of $1100 was made");
		
		ca.displayAccount();
	}
}
