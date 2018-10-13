
public class Increment {

	public static void main(String[] args) {
		int c = 1;
		System.out.printf("%d%n", c); //1
		System.out.printf("%d%n", c++);//1
		System.out.printf("%d%n", c); //2
		System.out.printf("%d%n", ++c); // 3
		
		System.out.printf("%d%n", c--);//3
		System.out.printf("%d%n", c); //2
		System.out.printf("%d%n", --c); //1

	}

}
