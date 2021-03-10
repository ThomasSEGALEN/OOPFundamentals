package fr.campusacademy.oopcourse.revisionoop.launcher;

import fr.campusacademy.oopcourse.revisionoop.model.Vehicle;
import fr.campusacademy.oopcourse.revisionoop.model.Car;
import fr.campusacademy.oopcourse.revisionoop.model.Bike;
import java.util.Random;

public class Launcher {

	public static void main(String[] args) {
//		Vehicle vehicle = new Vehicle();
//		vehicle.turn();
//		
//		Car car = new Car();
//		car.turn();
//		
//		Bike bike = new Bike();
//		bike.turn();
		
		Vehicle myRandomVehicle = getRandomVehicle();
		myRandomVehicle.start();
	}
		
	public static Vehicle getRandomVehicle() {
		Random random = new Random();
		if (random.nextBoolean()) {
			return new Car();
		} else {
			return new Bike();
		}
	}
}
