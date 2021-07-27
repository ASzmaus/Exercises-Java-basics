package BankAccount;

public class Person {
private String name;
	
	public Person( String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name=newName;
	}
	
	public String toString() {
		return  this.getName();
	}
}
