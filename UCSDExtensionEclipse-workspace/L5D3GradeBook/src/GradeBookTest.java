
public class GradeBookTest {

	public static void main(String[] args) {
		int[] grades = {95,93,90,96,94,96,99,95};
		GradeBook myGradeBook = new GradeBook("Intro to Java", grades);
		System.out.println("Welcome to grade book for " + myGradeBook.getCourseName());
		myGradeBook.processGrades();
		System.out.println("All done");

	}

}
