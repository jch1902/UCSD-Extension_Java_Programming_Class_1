package demo;

import java.util.Scanner;

public class MaximumFinder {

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo);
		System.out.println(demo.toString());
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		//Scanner in2 = new Scanner(System.in);
		System.out.print("Enter three floating-point numbers" + " separated by spaces");
		
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		double num3 = in.nextDouble();
		double result = maximum(num1, num2, num3);
		System.out.println("Max is " + result);
	}

	private static double maximum(double num1, double num2, double num3) {
		double maximum = num1;
		if(num2 > maximum) {
			maximum = num2;
		}
		if(num3 > maximum) {
			maximum = num3;
		}
		return maximum;
	}

}
