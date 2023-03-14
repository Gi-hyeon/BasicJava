package homework02;

public class SavingsAccount extends BankAccount{
	private double interestRate;
	
	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	public void updateBalance(int period) {
		balance += balance * interestRate * period;
	}
}
