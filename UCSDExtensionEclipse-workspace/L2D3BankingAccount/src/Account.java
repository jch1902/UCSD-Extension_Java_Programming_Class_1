
/**
 * @author Jasper
 *
 */

public class Account {
	private String name; //Instance variable
	private int accountNumber;
	private double balance;
	//Declare methods to access private name
	
	//Setting the account name
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		
	//Create a constructor
		public Account(String name) {
			this.name = name;
		}
		public Account() {
			// TODO Auto-generated constructor stub
		}
		public Account(String name, int accountNumber) {
			//this.name = name;
			this(name);
			this.accountNumber = accountNumber;
		}
		public Account(String name, int accountNumber, double balance) {
			//this.name = name;
			//this.accountNumber = accountNumber;
			this(name, accountNumber);
			this.balance = balance;
		}
		
	//Testing a different version of overriding toString but instead named it thisString
		public String thisString() {
			return super.toString() + "," + name + "," + accountNumber + ", " + balance;
			
		}
	
	//toString method to configure the output of when you put in toString in AccountTest
		public String toString() {
			return name+ ": " + accountNumber + ": " + balance;
		}

	//Setting the account number
		public void setAccountNumber(int accountNumber){
			this.accountNumber = accountNumber;
		}
		public int getAccountNumber() {
			return accountNumber;
		}
	//Setting balance
		public void deposit(double depositAmount ) {
			if(depositAmount > 0.0) {
				balance = balance + depositAmount;
			}
		}
		public double getBalance() {
			return balance;
		}
		
}

