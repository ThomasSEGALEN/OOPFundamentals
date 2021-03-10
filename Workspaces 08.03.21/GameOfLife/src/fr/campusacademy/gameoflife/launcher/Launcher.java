package fr.campusacademy.gameoflife.launcher;

import java.util.Scanner;

import fr.campusacademy.gameoflife.model.World;

public class Launcher {

	public static void main(String[] args) {
		int wave = 0;
		Scanner input = new Scanner(System.in);
		World myWorld = new World(10, 10);

		while (true) {
			System.out.println(myWorld);
			System.out.println("Wave: " + wave);
			input.nextLine();
			myWorld.newGeneration();
			wave += 1;
		}
	}
}