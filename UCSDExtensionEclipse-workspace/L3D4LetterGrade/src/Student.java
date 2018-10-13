
public class Student {
	private String name;
	private double average;
	
	//Constructor
	public Student(String name, double average) {
		this.name = name;
		this.average = average;
	}
	public Student() {
		
	}
	//Get the name and average
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAverage() {
		return average;
	}
	//override toString
	public String toString() {
		String s = super.toString();
		return s + ": " + name + " - " + average;
	}
}
