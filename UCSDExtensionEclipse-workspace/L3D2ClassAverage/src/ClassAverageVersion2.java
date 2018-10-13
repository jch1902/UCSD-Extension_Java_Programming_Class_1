import java.util.Scanner;

public class ClassAverageVersion2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int total = 0; int gradeCounter = 0;
		System.out.printf("Enter grade or -1 to quit");
		int grade = in.nextInt();
		while(grade != -1) {
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			System.out.println("Enter grade or -1 to quit");
			grade = in.nextInt();
			
		}
	if (gradeCounter != 0) {
		int average = total / gradeCounter;
		System.out.println("Class Average: " + average);
	}
	
	}

}
