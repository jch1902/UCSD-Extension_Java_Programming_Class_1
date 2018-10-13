//Jasper Hoong
public class Student {
	
	private String name;
	private double average;
//	
	//constructors
	public Student(String name, double average) {
		this.name = name;
		if(average > 0.0 && average <= 100.0) {
			this.average = average;
		}
	}
//	
//	
	//Get & set student name
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	//Get average
	public double getAverage() {
		return average;
	}
	//Get student grade
	public String getLetterGrade() {
		String letterGrade = "";//empty string
		if(average >= 90.0) {
			letterGrade = "A";
		}else if(average >= 80.0){
			letterGrade = "B";
		}else if(average >= 70.0) {
			letterGrade = "C";
		}else if(average >= 60.0) {
			letterGrade = "D";
		}else {
			letterGrade = "F";
		}
		return letterGrade;
		
	}
//

}
