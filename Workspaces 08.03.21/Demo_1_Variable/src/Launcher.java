public class Launcher {

	public static void main(String[] args) {

		System.out.println("Start");

		int myVariableInt = 10;
		myVariableInt += 5;
		System.out.println(myVariableInt);

		long myVariableLong = 10L;

		// Not working because can't put a long into an int
		// int myVariableInt2 = 20L;
		// Working because can put an int into a long
		// long myVariableLong2 = 20;

		float myVariableFloat = 20.0F;
		double myVariableDouble = 20.0;

		// Not working because can't put a double into a float
		// float myVariableFloat2 = 40.0;
		// Working because can put a float into a double
		// double myVariableDouble2 = 40.0F;

		char myChar = 'A';

		String myString = "Hello World !";
		// Taking the first character of a String
		char myFirstChar = myString.charAt(0);

		System.out.println(myVariableInt);
		System.out.println(myVariableFloat);
		System.out.println(myChar);
		System.out.println(myFirstChar);

		System.out.println("End");

	}
}