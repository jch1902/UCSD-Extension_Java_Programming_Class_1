
public class Time1 {
	//Member variables
	int hour; //0-23
	private int minute;// 0 -59
	public int second; //0-59
	
	//Constructor
	public Time1() {
		this(0,0,0);
	}
	public Time1(int hour, int minute, int second) {
		//verify the inputs
		if(hour < 0 || hour > 23) {
			throw new IllegalArgumentException("Hour invalid!");
			//NOTE: we never get here...
		}
		if(minute < 0 || minute > 59) {
			throw new IllegalArgumentException("Minute invalid!");
		}
		if(second < 0 || second > 59) {
			throw new IllegalArgumentException("Second invalid!");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public Time1(int hour) {
		this(hour, 0, 0);
	}
	public Time1(int hour, int minute) {
		this(hour, minute, 0);
	}
	

	public String toString() {
		return String.format("%02d:%02d:%02d", hour,minute,second);
	}
}
