public class Launcher {

	public static void main(String[] args) {

		int i = 3;

		if (i > 0) {
			int j = 25;
			System.out.println(j);
			System.out.println(i);

		}

		/*
		 * Can't access j because j only exists in previous block System.out.println(j);
		 */

		// Ternary operator
		int a = -2;
		int b = (a < 0 ? 0 : a);
		System.out.println(b);

	}

}