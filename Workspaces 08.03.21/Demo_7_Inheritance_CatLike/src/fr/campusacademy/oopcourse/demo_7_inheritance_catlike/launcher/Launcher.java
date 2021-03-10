package fr.campusacademy.oopcourse.demo_7_inheritance_catlike.launcher;

import fr.campusacademy.oopcourse.demo_7_inheritance_catlike.model.Cat;
import fr.campusacademy.oopcourse.demo_7_inheritance_catlike.model.CatLike;
import fr.campusacademy.oopcourse.demo_7_inheritance_catlike.model.Tiger;

public class Launcher {

	public static void main(String[] args) {

		CatLike catlike = new CatLike("Bob", "Black", 100.0F);
		
		System.out.println(catlike);
		
		Cat cat = new Cat();
		cat.setName("Sombrero");
		cat.setColor("Grey");
		cat.setWeight(4.4F);
		cat.cleanItSelf();

		System.out.println(cat);

		Tiger tiger = new Tiger();
		tiger.setName("Tigrou");
		tiger.setColor("Yellow");
		tiger.setWeight(45.5F);
		tiger.cleanItSelf();

		System.out.println(tiger);

		Cat cat2 = new Cat("Pompom", "White", 3.2F);
		cat2.cleanItSelf();

		System.out.println(cat2);

		Tiger tiger2 = new Tiger("Robert", "Brown", 98.2F);
		tiger2.cleanItSelf();
		
		System.out.println(tiger2);
	}

}