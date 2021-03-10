package fr.campusacademy.oopcourse.demo_9_polymorphism.launcher;

import fr.campusacademy.oopcourse.demo_9_polymorphism.model.Cat;
import fr.campusacademy.oopcourse.demo_9_polymorphism.model.Catlike;
import fr.campusacademy.oopcourse.demo_9_polymorphism.model.Tiger;

public class Launcher {

	public static void main(String[] args) {

		Catlike catlike = new Catlike();
		Cat cat = new Cat();
		Tiger tiger = new Tiger();

		// Polymorphism : declared type is not true type
		// Declared type : type of the variable
		// True type : type of the instance
		Catlike catlike2 = new Tiger();
		Catlike catlike3 = new Cat();

		Catlike[] catLikeArray = new Catlike[3];
		catLikeArray[0] = new Cat();
		catLikeArray[1] = new Tiger();
		catLikeArray[2] = new Catlike();

		Catlike catlike4 = new Cat();
		catlike4.sleep();
		// catlike4.eatCatFood();
		// Not working, need cast

		// Cast : convert variable to another type
		Cat myCat = (Cat) catlike4;
		myCat.eatCatFood();

		Object myObject = new Cat();

		// Crash, myObject does not contains a cat
		// Tiger myTiger = (Tiger) myObject;

		// Instanceof test the true type
		if (myObject instanceof Cat) {
			
			System.out.println("This is a cat!");
			Cat myCat2 = (Cat) myObject;
			myCat2.eatCatFood();

		} else if (myObject instanceof Tiger) {
			
			System.out.println("This is a Tiger");
			Tiger tiger5 = (Tiger) myObject;
			tiger5.eatHuman();
		}

	}

}