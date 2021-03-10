package fr.campusacademy.oopscourse.inhertiancetraining.model;

public class Book {

	private String title;
	private int pageCount;

	public Book() {

	}

	public Book(String title, int pageCount) {
		this.title = title;
		this.pageCount = pageCount;
	}
	
	public void tellStory() {
		System.out.println("I am telling a book story");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

}
