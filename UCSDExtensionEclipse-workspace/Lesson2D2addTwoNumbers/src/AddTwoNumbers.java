import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		//Check for command-line arguments
		if(args.length != 0) {
			System.out.printf("args.length: %s%n", args.length);
			if(args.length != 2) {
				System.out.print("Must enter two numbers");
				return;
			}
			//Parse the command-line arguments
			//NOTE: We only assume 2 arguments
			String num1String = args[0];
			String num2String = args[1];
			int num1 = Integer.parseInt(num1String);
			int num2 = Integer.parseInt(num2String);
			int sum = num1 + num2;
			System.out.print(sum);
			return;
		}
//Prompt for 2 numbers
		System.out.print("Enter two numbers: ");
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		int number1 = input1.nextInt();
		int number2 = input2.nextInt();
		int sum = number1 + number2;
		System.out.println("Sum: " + sum );
		
	}

}
