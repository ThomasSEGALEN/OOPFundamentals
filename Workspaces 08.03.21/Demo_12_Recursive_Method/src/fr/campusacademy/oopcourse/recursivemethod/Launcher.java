package fr.campusacademy.oopcourse.recursivemethod;

import java.util.Scanner;

public class Launcher {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int firstValue = askInputNumberBetweenZeroAnd100("Please enter first number");
		int secondValue = askInputNumberBetweenZeroAnd100("Please enter second number");	
		System.out.println("First value is: " + firstValue + ", second value is: " + secondValue);
//		System.out.println("Hello Demo Recursive");
//		recursiveExemple(10);
		scanner.close();
	}

	public static int askInputNumberBetweenZeroAnd100(String message) {
		System.out.println(message);
		String inputStr = scanner.nextLine();
		int inputInteger = 0;
		
		try {
		inputInteger = Integer.parseInt(inputStr);
		} catch (NumberFormatException e) {
			//do something here if input not an int
			System.out.println("Invalid number\n");
			return askInputNumberBetweenZeroAnd100(message);
		}
		
		if (inputInteger < 0 || inputInteger > 100) {
			//do something here because not between 0 and 100
			System.out.println("Please enter a number between 0 and 100\n");
			return askInputNumberBetweenZeroAnd100(message);
		}
		return inputInteger;
	}

//	public static void recursiveExemple(int value) {
//		System.out.println("recursiveExemple" + value);
//		if(value <= 0) {
//			return;
//		}
//		value = value - 1;
//		recursiveExemple(value);
//	}
}
