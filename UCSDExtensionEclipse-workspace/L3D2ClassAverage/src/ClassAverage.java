import java.util.Scanner;

public class ClassAverage {
	public static void main(String[]args) {
		//create instance of scanner to input numbers
		
		//Anything you input will be scanned here
		Scanner hi = new Scanner(System.in);
		String oof = hi.nextLine();
		System.out.println(oof);
		
		//Set the max number of grades input
		int numGrades = 3;
		int total = 0; int gradeCounter = 1;
		while(gradeCounter <= numGrades) {
			System.out.println("Enter grades: ");
			Scanner in = new Scanner(System.in);
			gradeCounter = gradeCounter + 1;
			int grade = in.nextInt();
			total = total + grade;
		}
		int average = total/numGrades;
		System.out.printf("Class average: %d%n", average);
		double averageDouble = total / numGrades;
		System.out.printf("Class average: %f%n", averageDouble);
	}
}
