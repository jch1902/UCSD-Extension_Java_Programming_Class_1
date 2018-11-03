import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		Date birthDate = new Date(12,14,2000);
		Date hireDate = new Date(6,7,2016);
		Employee e = new Employee("John","Doe",birthDate,hireDate);
		employees.add(e);

		Date birthDate1 = new Date(6,12,2002);
		Date hireDate1 = new Date(8,14,2021);
		 e = new Employee("Sally","Ride",birthDate1,hireDate1);
		employees.add(e);
		for(Employee e1 : employees) {
			System.out.println(e1);
			
		}
		System.out.println("Num Employees: " + Employee.getCountOfEmployees());
	}

}
