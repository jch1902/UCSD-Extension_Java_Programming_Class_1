
public class Date {
	private int month;//1-12
	private int day;//1-31
	private int year;//e.g. 2018
	
	//Constructor
	public Date(int m, int d, int y) {
		//Not recommended method
		//TODO range checking
		month = m;
		day = d;
		year = y;
		if(month < 1 || month > 12) {
			throw new IllegalArgumentException("Month invalid!");
		}
		if(day < 1 || day > 31) {
			throw new IllegalArgumentException("Day invalid!");
		}
	}
	public String toString() {
		return String.format("%02d-%02d-%02d", month,day,year);
	}
}
