package fr.campusacademy.oopcourse.demo13arraylist.launcher;

import java.util.ArrayList;

public class Launcher {

	public static void main(String[] args) {
		// array has a fix size, ex:
		Cat[] myCatArray = new Cat[5];

		//
		ArrayList<Cat> myCatList = new ArrayList();
		System.out.println(myCatList.size());

		Cat bob = new Cat();
		myCatList.add(bob);
		myCatList.add(new Cat());
		
		System.out.println(myCatList.size());
		
		Cat myCat = myCatList.get(0);
	}
}

class Cat {

	public Cat() {

	}
}