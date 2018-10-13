import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Student student2 = new Student();
		student2.setName("John");
		System.out.println(student2);
		String msg1 = "Enter student name and average";
		String msg2 = "Example: John 95.4";
		String msg3 = "Press Ctrl+z to end";
		
		System.out.printf("%s%n%s%n%s%n", msg1, msg2, msg3);
		
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Enter name: ");
			String name = in.nextLine();
			System.out.print("Enter average: ");
			double average = in.nextDouble();
			Student student = new Student(name, average);
			System.out.println(student);
		}while(in.hasNext());
		System.out.println("All Done");
	}

}
