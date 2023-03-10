package homework01;

public class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) { //입금(예금)
		balance += amount;
	}
	
	public boolean withdraw(int amount) { //출금
		if(amount > balance) {
			return false;
		} else {
			balance -= amount;
			return true;
		}
	}
	
	public boolean transfer(int amount, BankAccount otherAccount) {
		if(withdraw(amount)) {
			otherAccount.deposit(amount);
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%,d", balance);
	}
	
}
