package fr.campusacademy.oopcourse.demo_5_car.model;

public class Car {

	// Static variable = Class variable
	public static int nbOfWheels = 4;
	
	// Attributes / Instance variables = States
	public String color;
	public double price;
	public String brand;

	// Default constructor (construct without parameters)
	public Car() {

		System.out.println("Creating a new instance of car");
	}

	public Car(String brand) {

		this.brand = brand;
	}

	public Car(String color, double price, String brand) {

		this.color = color;
		this.price = price;
		this.brand = brand;
	}

	// Instance methods (non-static) = Behavior
	public void startEngine() {

		System.out.println("StartEngine");
		System.out.println("Car's color is " + this.color);
		System.out.println("Car's price is " + this.price);
		System.out.println("Car's brand is " + this.brand);
		System.out.println("Number of wheels " + Car.nbOfWheels);
		System.out.println("");
	}

	public void stopEngine() {
		
		System.out.println("StopEngine");
		System.out.println("Car's color is " + this.color);
		System.out.println("Car's price is " + this.price);
		System.out.println("Car's brand is " + this.brand);
		System.out.println("Number of wheels " + Car.nbOfWheels);
		System.out.println("");
	}
	
	public static void printAllCarBrand() {

		System.out.println("BMW");
		System.out.println("Peugeot");
		System.out.println("Renault");
		System.out.println("Fiat");
		System.out.println("");
	}

}