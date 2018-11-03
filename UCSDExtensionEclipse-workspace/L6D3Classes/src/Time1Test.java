import java.util.ArrayList;

public class Time1Test {

	public static void main(String[] args) {
		
		Time1 t1 = new Time1();
		Time1 t2 = new Time1(10);
		Time1 t3 = new Time1(10,10);
		Time1 t4 = new Time1(10,10,10);
		ArrayList<Time1> times = new ArrayList<Time1>();
		times.add(t1); times.add(t2); times.add(t3);times.add(t4);
		
		
		for(Time1 t:times) System.out.println(t);
		try {
			Time1 t5 = new Time1(50,50,50);//ERROR!!!
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("Continuing..");
		}
		
	}

}
