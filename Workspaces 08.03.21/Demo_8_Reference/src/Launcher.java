public class Launcher {

	public static void main(String[] args) {

		int myInt = 10;
		changeMyInt(myInt);
		System.out.println(myInt);
		// Primitive types are pass by value (copy of value)

		Cat cat = new Cat("White");
		changeMyCat(cat);
		System.out.println(cat.color);
		// Object types are pass by reference

		cat = null;
		// cat is lost
		
	}

	static void changeMyInt(int myInt) {

		myInt = 0;
	}

	static void changeMyCat(Cat cat) {

		cat.color = "Black";
	}
}