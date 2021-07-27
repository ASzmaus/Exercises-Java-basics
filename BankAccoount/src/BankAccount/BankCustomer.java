package BankAccount;

public class BankCustomer {
private Person person;
	
	public BankCustomer(Person person) {
		this.person=person;
	}
	
	private Account account = new Account();
	
	public Account getAccount(){
		return account;
	}

	public String toString() {
		return  "Customer: " + this.person + " balance of " + this.getAccount();
	}
}
