public class Launcher {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			sayHello();
			sayHello("Bob");

		}
	}

	static void sayHello() {
		System.out.println("Hey you !");

	}

	static void sayHello(String name) {
		System.out.println("Hey " + name + " !");

	}
}