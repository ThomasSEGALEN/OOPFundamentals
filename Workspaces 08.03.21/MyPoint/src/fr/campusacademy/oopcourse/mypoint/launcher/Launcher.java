package fr.campusacademy.oopcourse.mypoint.launcher;

import fr.campusacademy.oopcourse.mypoint.model.MyPoint;

public class Launcher {
	
	public static void main(String[] args) {
//		MyPoint p1 = new MyPoint(3, 4);
//		System.out.println(p1.distance(5, 6));
//		MyPoint p2 = new MyPoint(10, 3);
//		System.out.println(p1.distance(p2));
		
//		MyPoint p1 = new MyPoint(); // Test constructor
//		System.out.println(p1); // Test toString()
//		p1.setX(8); // Test setters
//		p1.setY(6);
//		System.out.println("x is: " + p1.getX()); // Test getters
//		System.out.println("y is: " + p1.getY());
//		p1.setXY(3, 0); // Test setXY()
//		System.out.println(p1.getXY()[0]); // Test getXY()
//		System.out.println(p1.getXY()[1]);
//		System.out.println(p1);
//		MyPoint p2 = new MyPoint(0, 4); // Test another constructor
//		System.out.println(p2);
//		
//		System.out.println(p1.distance(p2)); // which method?
//		System.out.println(p2.distance(p1)); // which method?
//		System.out.println(p1.distance(5, 6)); // which method?
//		System.out.println(p1.distance()); // which method?

		// Declare an array of My Point
		MyPoint[] points = new MyPoint[10];
		for (int i = 0; i < points.length; i++) {
			points[i] = new MyPoint(i+1, i+1);
			System.out.println(points[i]);
		}
	}
}
