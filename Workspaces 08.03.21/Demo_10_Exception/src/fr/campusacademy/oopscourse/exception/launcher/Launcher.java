package fr.campusacademy.oopscourse.exception.launcher;

public class Launcher {

	public static void main(String[] args) {

		System.out.println("start");

		try {
			// Checked exception - program should recover from
			Thread.sleep(1000);
		} catch (Exception e) {

		}

		try {
			// Runtime exception - caused by internal state
			System.out.println("before division");
			int i = 10 / 0; // arg, exception!
			System.out.println("after division");

			System.out.println("before nullponter");
			Object myObject = null;
			myObject.toString(); // arg, exception!
			System.out.println("after nullpointer");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Arithmetic!");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("NullPointer!");
		}

		System.out.println("end");
	}
}
