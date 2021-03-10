package fr.campusacademy.oopcourse.launcher;

public class Launcher {

	public static void main(String[] args) {

		int myVariable = 10;

		// Copy of value
		changeMyInt(myVariable);

		int firstValue = 15;

		// Copy of value
		int secondValue = firstValue;

		firstValue = 0;

		System.out.println(myVariable);
		System.out.println(firstValue);
	}

	static void changeMyInt(int myInt) {
		myInt = 0;
	}

}
