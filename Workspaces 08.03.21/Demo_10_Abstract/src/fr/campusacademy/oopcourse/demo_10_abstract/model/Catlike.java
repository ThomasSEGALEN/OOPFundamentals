package fr.campusacademy.oopcourse.demo_10_abstract.model;

public abstract class Catlike implements Animal {

	public abstract void hunt();

	public void climb() {

		System.out.println("Climbing");
	}

	@Override
	public void sleep() {

		System.out.println("Sleeping like a catlike");
	}

	@Override
	public void play() {

		System.out.println("Playing like a catlike");
	}

}