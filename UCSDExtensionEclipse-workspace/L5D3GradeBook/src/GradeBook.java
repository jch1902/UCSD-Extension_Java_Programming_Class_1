
public class GradeBook {
	private String courseName;
	private int[] grades;
	
	public GradeBook(String courseName, int[] grades) {
		this.courseName = courseName;
		this.grades = grades;
		
	}
	public void setCourseName(String name) {
		this.courseName = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void processGrades() {
		outputGrades();
		double averageGrade= getAverage();
		int minGrade = getMinGrade();
		int maxGrade = getMaxGrade();
		outputHeader(averageGrade, minGrade, maxGrade);
		outputBarChart();
	}
	private void outputBarChart() {
		
	}
	private void outputHeader(double averageGrade, int minGrade, int maxGrade) {
		System.out.println("Course name: " + courseName);
		System.out.println("Average: " + averageGrade);
		System.out.println("Max Grade: " + maxGrade);
		System.out.println("Min Grade: " + minGrade);
		
	}
	private int getMaxGrade() {
		int highGrade = grades[0]; //Assume biggest
		for(int grade : grades) {
			if(grade > highGrade) highGrade = grade;
		}
		return highGrade;
	}
	private int getMinGrade() {
		int lowGrade = grades[0]; //Assume smallest
		for(int grade : grades) {
			if(grade < lowGrade) lowGrade = grade;
		}
		return lowGrade;
	}
	private double getAverage() {
		int total = 0;
		for (int grade : grades) {
			total += grade;
		}
		return (double) total /grades.length;
	}
	private void outputGrades() {
		System.out.println("The grades are");
		for(int student = 0; student < grades.length; student ++){
			System.out.printf("Student %2d: %3d%n", student+1,grades[student]);
		}
	}
}
