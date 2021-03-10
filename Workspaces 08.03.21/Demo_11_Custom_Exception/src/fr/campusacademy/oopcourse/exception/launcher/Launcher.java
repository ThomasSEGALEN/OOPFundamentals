package fr.campusacademy.oopcourse.exception.launcher;

import fr.campusacademy.oopcourse.exception.model.MyCustomException;

public class Launcher {

	public static void main(String[] args) {

		System.out.println("Hello Custom Exception");

		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void method1() throws MyCustomException {
		method2();
	}

	public static void method2() throws MyCustomException {
		method3();
	}

	public static void method3() throws MyCustomException {
		throw new MyCustomException();
	}
}
