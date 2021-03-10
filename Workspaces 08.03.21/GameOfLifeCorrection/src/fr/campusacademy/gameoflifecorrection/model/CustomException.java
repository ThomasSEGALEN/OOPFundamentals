package fr.campusacademy.gameoflifecorrection.model;

public class CustomException extends RuntimeException {

	public void NullPointerException() {
	    System.out.println("Value is null");
	}
	
	public void NegativeArraySizeException() {
		System.out.println("Value is negative");
	}
}
