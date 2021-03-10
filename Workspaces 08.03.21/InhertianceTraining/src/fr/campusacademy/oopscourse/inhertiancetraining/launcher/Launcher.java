package fr.campusacademy.oopscourse.inhertiancetraining.launcher;

import fr.campusacademy.oopscourse.inhertiancetraining.model.Book;
import fr.campusacademy.oopscourse.inhertiancetraining.model.ComicStrip;
import fr.campusacademy.oopscourse.inhertiancetraining.model.Novel;

public class Launcher {

	public static void main(String[] args) {
		System.out.println("Hello InheritanceTraining");

		int myInt = 10;
		System.out.println("My int " + myInt);
		changeMyInt(myInt);
		System.out.println("My int " + myInt);

		Book myBook = new Book();
		myBook.setTitle("Toto à la plage");
		System.out.println("Book title " + myBook.getTitle());
		changeMyTitle(myBook);
		System.out.println("Book title " + myBook.getTitle());
		System.out.println();
		
		Book myBook1 = new Book();
		Book myBook2 = new Novel();
		Book myBook3 = new ComicStrip();
		
		myBook1.tellStory();
		myBook2.tellStory();
		myBook3.tellStory();
	}

	public static void changeMyInt(int myInt) {
		myInt = 0;
	}

	public static void changeMyTitle(Book myBook) {
		myBook.setTitle("Toto à la mer");
	}

}
