package fr.campusacademy.gameoflifecorrection.launcher;

import java.util.Scanner;

//import fr.campusacademy.gameoflifecorrection.model.CustomException;
import fr.campusacademy.gameoflifecorrection.model.World;

public class Launcher {

	public static void main(String[] args) {

		World myWorld = null;

		Scanner scanner = new Scanner(System.in);

		int columnInt = 0;
		while (columnInt == 0) {
			System.out.println("Please enter the number of columns of the world:");
			String columnStr = scanner.nextLine();

			try {
				columnInt = Integer.parseInt(columnStr);
			} catch (NumberFormatException e) {
				System.out.println("Input is not valid");
			}
		}

		int rowInt = 0;
		while (rowInt == 0) {
			System.out.println("Please enter the number of rows of the world:");
			String rowStr = scanner.nextLine();

			try {
				rowInt = Integer.parseInt(rowStr);
			} catch (NumberFormatException e) {
				System.out.println("Input is not valid");
			}
		}

		myWorld = new World(rowInt, columnInt);

		System.out.println(myWorld);

		while (true) {
			System.out.println("New Generation");

			myWorld.newGeneration();
			System.out.println(myWorld);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
//	public static void exception1() throws CustomException {
//		throw new NullPointerException();
//	}
//	
//	public static void exception2() throws CustomException {
//		throw new NegativeArraySizeException();
//	}
}