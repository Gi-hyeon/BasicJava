package homework03;

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
	
	public boolean transfer(int amount, BankAccount otherAccount) {
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
