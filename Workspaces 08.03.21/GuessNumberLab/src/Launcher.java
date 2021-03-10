import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int number = 1 + (int) (Math.random() * 99), guess, count = 0;

		System.out.println("Hello, please guess a number:");

		while ((guess = keyboard.nextInt()) != number) {

			if (guess > number) {
				System.out.println("Lower");
			} else {
				System.out.println("Higher");
			}
			count++;
		}

		System.out.println("This is it, you won ! The number was: " + number);

	}

}