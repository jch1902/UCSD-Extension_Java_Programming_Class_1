
public class Demo {
	//Fields
	public int countInstance;
	//Class variable (one per class)
	public static int countStatic;
	
	//Methods
	public void methodInstance() {
		System.out.println("countInstance: " + countInstance);
	}
	public static void methodStatic() {
		System.out.println("countStatic: " + countStatic);
	}
	
	
}
