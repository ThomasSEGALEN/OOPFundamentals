public class Launcher {

	public static void main(String[] args) {

		// Table size in x
		int xTableNumber = 5;
		// Table size in y
		int yTableNumber = 10;

		// Line 1 of table (x line)
		System.out.print(" * |");
		for (int i = 1; i <= xTableNumber; i++)
			System.out.print(addSpace(i) + " ");
		System.out.println("");

		// Line 2 of table
		System.out.print("---+");
		for (int j = 1; j <= xTableNumber; j++)
			System.out.print("----");
		System.out.println("");

		// Multiplication (+ y line)
		for (int k = 1; k <= yTableNumber; k++) {
			System.out.print(addSpace(k) + "|");
			for (int l = 1; l <= xTableNumber; l++) {
				System.out.print(addSpace(k * l) + " ");
			}
			System.out.println("");
		}
	}

	// Add space depending of number's length
	public static String addSpace(int y) {
		String str = new String();
		if (y < 10)
			str = "  " + y;
		else if (y < 100)
			str = " " + y;
		else
			str = "" + y;
		return str;
	}
}