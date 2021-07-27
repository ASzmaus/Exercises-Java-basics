package BankAccount;

public class Account {
	private static double interestRate;	
	private double balance=0;

		public boolean deposit(int amount) { 
			if(amount<0) {
				return false;
			}
			else {
				balance+=amount;
				return true;	
			}
		}

		public boolean withdraw(int amount){ 
			if(amount>balance || amount<=0 || balance <= 0) {
				return false;
			}
			else {
				balance-=amount;
				return true;
			}
		}
		
		public boolean transfer(Account otherAccount, int amount ) { 
			if(amount>balance ||amount<0) {
				return false;
			}
			else {
				this.withdraw(amount);
				otherAccount.deposit(amount);
				return true;
			}
		}
		
		public double addInterest() {
			balance+= balance*interestRate/100;
			return balance;
		}
		
		public static void setInterestRate(double newInterestRate ) {
			interestRate=newInterestRate;
		}
		
		public String toString() {
			return "account " + this.balance;
		}
}
