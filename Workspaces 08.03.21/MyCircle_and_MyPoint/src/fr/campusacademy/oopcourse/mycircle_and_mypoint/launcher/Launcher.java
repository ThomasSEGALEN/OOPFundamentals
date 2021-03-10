package fr.campusacademy.oopcourse.mycircle_and_mypoint.launcher;

import fr.campusacademy.oopcourse.mycircle_and_mypoint.model.MyCircle;

public class Launcher {

	public static void main(String[] args) {
		MyCircle c1 = new MyCircle(3, 4, 2);
		MyCircle c2 = new MyCircle(10, 3, 2);
		System.out.println("Circle1:");
		System.out.println(c1.getArea());
		System.out.println(c1.getCricumference());
		System.out.println(c1);
		System.out.println("Circle2:");
		System.out.println(c2.getArea());
		System.out.println(c2.getCricumference());
		System.out.println(c2);
		System.out.println("Distance:");
		System.out.println(c1.distance(c2));
	}
}
