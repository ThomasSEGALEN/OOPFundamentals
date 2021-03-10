package fr.campusacademy.oopcourse.mytriangle_and_mypoint.launcher;

import fr.campusacademy.oopcourse.mytriangle_and_mypoint.model.MyTriangle;

public class Launcher {

	public static void main(String[] args) {
		MyTriangle t1 = new MyTriangle(3, 4, 2, 5, 5, 5);
		MyTriangle t2 = new MyTriangle(1, 0, 2, 2, 3, 0);
		MyTriangle t3 = new MyTriangle(0, 4, -2, 4, 7, -2);
		System.out.println("Triangle1:");
		System.out.println(t1.getPerimeter());
		System.out.println(t1.getType());
		System.out.println(t1);
		System.out.println("Triangle2:");
		System.out.println(t2.getPerimeter());
		System.out.println(t2.getType());
		System.out.println(t2);
		System.out.println("Triangle3:");
		System.out.println(t3.getPerimeter());
		System.out.println(t3.getType());
		System.out.println(t3);
	}
}
