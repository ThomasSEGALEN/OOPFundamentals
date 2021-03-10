package fr.campusacademy.oopcourse.authorandbook.launcher;

import fr.campusacademy.oopcourse.authorandbook.model.Author;
import fr.campusacademy.oopcourse.authorandbook.model.Book;

public class Launcher {

	public static void main(String[] args) {

		Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'M');
		Author anAuthor2 = new Author("zZz", "zZz@zZz.com", 'F');

		System.out.println(anAuthor.getName());
		System.out.println(anAuthor.getEmail());
		System.out.println(anAuthor.getGender());

		System.out.println(anAuthor);

		System.out.println("");

		System.out.println(anAuthor2.getName());
		System.out.println(anAuthor2.getEmail());
		System.out.println(anAuthor2.getGender());

		System.out.println(anAuthor2);

		System.out.println("");

		Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
		Book anotherBook = new Book("more Java for dummy", new Author("zZz", "zZz@zZz.com", 'F'), 29.95, 888);
		
		System.out.println(aBook.getName());
		System.out.println(aBook.getAuthor());
		System.out.println(aBook.getPrice());
		System.out.println(aBook.getQtyInStock());

		System.out.println(aBook);
		
		System.out.println("");
		
		System.out.println(anotherBook.getName());
		System.out.println(anotherBook.getAuthor());
		System.out.println(anotherBook.getPrice());
		System.out.println(anotherBook.getQtyInStock());

		System.out.println(anotherBook);
	}

}