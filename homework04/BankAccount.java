package homework04;

public abstract class BankAccount {
	protected int balance;
	
	abstract String getAccountType();
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public boolean withdraw(int amount) {
		if(amount > balance) {
			return false;
		} else {
			balance -= amount;
			return true;
		}
		
//		balance -= amount;
//		return true;
	}
	
//	throws? 예외발생해주는 경우는 별로 없다. try catch finally
	
	public boolean transfer(int amount, BankAccount otherAccount) {
		if(amount < 0 || amount > balance) {
			throw new IllegalArgumentException();
		}
		
		if(otherAccount == null) {
			throw new NullPointerException();
		}
		
		if(withdraw(amount)) {
			otherAccount.deposit(amount);
			return true;
		} else {
			return false;
		}
		
		
//		balance -= amount;
//		otherAccount.deposit(amount);
//		return true;
	}
	
	@Override
	public String toString() {
		return String.format("%,d", balance);
	}
	
}
