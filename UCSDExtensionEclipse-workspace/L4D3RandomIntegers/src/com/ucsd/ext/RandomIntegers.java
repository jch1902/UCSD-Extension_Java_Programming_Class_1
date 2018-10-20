package com.ucsd.ext;

import java.security.SecureRandom;
import java.util.Random;

public class RandomIntegers {

	public static void main(String[] args) {
		// Create random number generator
		//SecureRandom sr = new SecureRandom();
		Random sr = new Random();
		for(int i = 1; i < 20; i++) {
			// A random number from 1 - 6
			int face = 1 + sr.nextInt(6);
			System.out.printf("%d " , face);
			// If count divisible by 5, start new line 
			if(i % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Part 2 of the demo");
		
		int freq1 = 0; //Count of 1's rolled
		int freq2 = 0; //Count of 2's rolled
		int freq3 = 0; //Count of 3's rolled
		//TODO
		System.out.println("Roll dice 60 Million times");
		for (int roll = 1; roll <= 60_000_000; roll++) {
			int face = 1 + sr.nextInt(6);
			switch(face) {
				case 1: freq1++;
					break;
				case 2: freq2++;
					break;
				case 3: freq3++;
					break;
			//TODO finish this
			}
		}
		System.out.println("Face\tFrequency");
		System.out.printf("1\t%d%n", freq1);
		System.out.printf("2\t%d%n", freq2);
		System.out.printf("3\t%d%n", freq3);
		//TODO finish this
	}

}
