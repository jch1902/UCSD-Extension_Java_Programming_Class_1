
public class AccountTest {

	public static void main(String[] args) {
		System.out.println("AccountTest Version 0.0.1");
		
		//Create an instance of Account class
		//That is, create an Account object
		Account account = new Account();
		System.out.println("Account: " + account);
		System.out.println("Account: " + account.toString()); //these two are the same, it's just that in the background, it runs .toString() when you only put account
		Account account1 = new Account();
		System.out.println("Account: " + account1);
		
		//Test getName and setName
		System.out.println("account.getName(): " + account.getName());
		account.setName("John Doe");
		System.out.println("account.getName(): " + account.getName());
		
		
		//Test the constructor
		Account actJohn = new Account("John Doe");
		Account actSally = new Account("Sally Smith");
		System.out.println(actJohn.getName());
		System.out.println(actSally.getName());
		Account actBilly = new Account("Billy Bob", 1234);
		System.out.println(actBilly.getName() + " @" + actBilly.getAccountNumber());
		Account actSue = new Account("Sue Smith", 4567, 100.00);
		System.out.println(actSue.getName() + ": " + actSue.getAccountNumber() + ": " + actSue.getBalance());
		
		
		//Demo primitive type vs reference types
		int intValue = 0; //primitive type
		Account refValue = null;//reference type
		refValue = actSue;
		System.out.println("intValue: " + intValue);
		System.out.println("refValue: " + refValue);
		System.out.println("refValue: " + refValue.toString());
		System.out.println("refValue: " + refValue.thisString());
		
	}


}
