
public class DemoTest {
	public static void main(String[]args) {
		//Demo class methods and class variables
		System.out.println("Demo.countStatic: " + Demo.countStatic);
		Demo.countStatic++;
		System.out.println("Demo.countstatic: " + Demo.countStatic);
		
		//Call a class method
		Demo.methodStatic();
		
		double x = 4.0;
		System.out.println("Math.sqrt(" + x + "): " + Math.sqrt(x));
		
		//Instance Methods and Instance Variables
		Demo demo1 = new Demo();
		Demo demo2 = new Demo();
		demo1.countInstance = 12;
		demo2.countInstance = 34;
		demo1.methodInstance();
		demo2.methodInstance();
		demo1.methodStatic();
		
	}
}
