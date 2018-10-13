
public class StudentTest {
	public static void main(String[]args) {
		Student student = new Student("Jasper", 100.0);
		Student sally = new Student("Sally Smith", 95.4);
		Student john = new Student("John Doe", 84.5);
		System.out.printf("student : %s%n", student);
		System.out.println("Student: " + student.getName() + " " + student.getAverage() + "/" + student.getLetterGrade());
		System.out.printf("Student: %s's letter grade is %s%n", sally.getName(), sally.getLetterGrade());
		System.out.printf("Student: %s's letter grade is %s%n", john.getName(), john.getLetterGrade());
	}
}
