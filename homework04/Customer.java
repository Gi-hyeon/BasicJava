package homework04;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount[] accounts;
	int numberOfAccounts;
	
	Customer(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
	}
	
	void addAccount(BankAccount account) {
		this.accounts[numberOfAccounts] = account;  //this.accounts[numberOfAccounts++] = account; 방법
		numberOfAccounts++;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public BankAccount getAccount(int index) {
		return accounts[index];
	}
	
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	
	public String toString() {
		return "이름: " + firstName + lastName + ", 계좌의 갯수: " + numberOfAccounts;
	}
}
