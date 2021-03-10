package fr.campusacademy.oopcourse.demo_10_abstract.model;

public class Cat extends Catlike {

	@Override
	public void hunt() {

		System.out.println("Miaou, hunting like a cat");
	}

	@Override
	public void climb() {

		System.out.println("Climbing like a cat");
	}

}
