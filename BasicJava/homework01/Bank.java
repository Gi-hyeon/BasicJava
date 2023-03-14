package homework01;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;
	
	public Bank() {
		customers = new Customer[10];
	}
	
	public void addCustomer(Customer customer) {
		this.customers[numberOfCustomers] = customer;  //this.customers[numberOfCustomers++] = customer; -> 방법임
		numberOfCustomers++;
	}
	
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	public Customer[] getCustomers() {
		return customers;
	}
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
}
