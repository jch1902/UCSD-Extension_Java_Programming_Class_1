
public class Employee {
	private String firstName;
	private String lastName;
	//Composition - this is a "has-a" relationship
	private Date birthDate;
	private Date hireDate;
	
	private static int countOfEmployees;
	public static int getCountOfEmployees(){
		return countOfEmployees;
	}
	
	public Employee(String firstName, String lastName,
			Date birthDate, Date hireDate) {
		countOfEmployees++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
	}
	public String toString() {
		return String.format("%s, %s, Birthday: %s Hire Date: %s", 
				firstName,lastName,birthDate,hireDate);	
	}
}
