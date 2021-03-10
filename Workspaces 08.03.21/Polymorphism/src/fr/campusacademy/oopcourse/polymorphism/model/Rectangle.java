package fr.campusacademy.oopcourse.polymorphism.model;

public class Rectangle extends Shape {

	protected double length;
	protected double width;

	public Rectangle(String color, double length, double width) {

		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public void getArea() {

		System.out.println(length*width);
	}

	@Override
	public String toString() {

		return super.toString() + " - Length: " + length + " - Width: " + width;
	}

}