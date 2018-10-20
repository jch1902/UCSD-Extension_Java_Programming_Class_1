package com.ucsd.ext;

public class Scope {
	private static int x = 1;
		
	public static void main(String[] args) {
		System.out.println("x " + x);
		int x = 5;
		System.out.println("x " + x);
		useLocalVariable();
		userField();
		System.out.printf("x %d", x);

	}
	private static void userField() {
		System.out.printf("x %d", x);
		
	}
	private static void useLocalVariable() {
		int x = 25;
		System.out.printf("x %d", x);
		
	}
	private static int sum(int num1, int num2) {
		return num1 + num2;
	}
	private static double sum(double num1, double num2) {
		return num1 + num2;
	}

}
