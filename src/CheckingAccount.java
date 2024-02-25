public class CheckingAccount extends BankAccount {
	private double interestRate;
	
	public void displayAccount() {
		super.accountSummary();
		System.out.println("Interest Rate: " + interestRate);
	}
	
	public void processWithdrawal(double amount) {
		super.withdrawal(amount);
		if(amount > this.getBalance()) {
			super.withdrawal(30);
			System.out.println
				("An overdraft fee of $30 was applied, new balance is: " 
				+ this.getBalance());
		}
	}

	public void setInterestRate(int rate) {
		this.interestRate = rate;
	}

	public void processDeposit(Double amount) {
		super.deposit(amount);
		
	}

}
