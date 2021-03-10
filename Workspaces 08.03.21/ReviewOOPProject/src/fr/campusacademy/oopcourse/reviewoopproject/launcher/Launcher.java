package fr.campusacademy.oopcourse.reviewoopproject.launcher;

import fr.campusacademy.oopcourse.reviewoopproject.model.Hammer;
import fr.campusacademy.oopcourse.reviewoopproject.model.Screwdriver;

public class Launcher {

	public static void main(String[] args) {
		
		System.out.println("Hello Review OOP");
		
		Hammer hammer = new Hammer();
		hammer.repair();
		
		Screwdriver screwdriver = new Screwdriver();
		screwdriver.repair();
	}
}
