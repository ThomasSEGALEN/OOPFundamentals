package fr.campusacademy.oopcourse.boardgame.model;

public class Box {

	private String color;
	private double height;
	private double width;

	public Box() {

	}

	public Box(String color, double height, double width) {

		super();
		this.color = color;
		this.height = height;
		this.width = width;
	}

	public String getColor() {

		return color;
	}

	public void setColor(String color) {

		this.color = color;
	}

	public double getHeight() {

		return height;
	}

	public void setHeight(double height) {

		this.height = height;
	}

	public double getWidth() {

		return width;
	}

	public void setWidth(double width) {

		this.width = width;
	}

}
