import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		System.out.print("Hello");
		System.out.print(" World");
		System.out.println();
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Please enter a username:");
		String user = input1.nextLine();
		
		System.out.printf("Hello, %s%n", user);
	}
}
