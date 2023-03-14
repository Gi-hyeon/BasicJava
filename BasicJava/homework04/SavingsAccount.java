package homework04;

public class SavingsAccount extends BankAccount{
	private double interestRate;
	
	@Override
	String getAccountType() {
		// TODO Auto-generated method stub
		return "저축예금";
	}
	
	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	public void updateBalance(int period) {
		balance += balance * interestRate * period;
	}
}
