package com.ucsd.ext;

import java.security.SecureRandom;


public class Craps {
	
	private static final SecureRandom sr = new SecureRandom();
	
	private enum Status{CONTINUE, WON, LOST};
	
	private static final int SNAKE_EYES = 2;
	private static final int BOX_CARDS = 12;
	
	
	public static void main(String[] args) {
		System.out.println("Simulation of Game of Craps");
		int myPoint = 0; //Point if no win or lost
		Status gameStatus;
		int sumOfDice = rollDice();
		switch (sumOfDice) {
		case 7:
		case 11:
				gameStatus = Status.WON;
				break;
		case SNAKE_EYES:
		case 3:
		case BOX_CARDS:
			gameStatus = Status.LOST;
			break;
		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			System.out.printf("Point is %d%n", myPoint);
			break;
		}
		while (gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();
			if(sumOfDice == myPoint) {
				gameStatus = Status.WON;
			}else {
				if(sumOfDice == 7) {
					gameStatus = Status.LOST;
				}
			}
		}
		if(gameStatus == Status.WON) {
			System.out.println("Player wins!");
		}else {
			System.out.println("Player loses");
		}
	}
	private static int rollDice() {
		int die1 = 1 + sr.nextInt(6);
		int die2 = 1 + sr.nextInt(6);
		int sum = die1+ die2;
		System.out.printf("Player rolled %d + %d = %d%n", die1 , die2 , sum);
		return sum;
	}

}
