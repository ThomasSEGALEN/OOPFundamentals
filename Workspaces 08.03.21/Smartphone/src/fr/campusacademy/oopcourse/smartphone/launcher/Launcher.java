package fr.campusacademy.oopcourse.smartphone.launcher;

import fr.campusacademy.oopcourse.smartphone.model.AndroidPhone;
import fr.campusacademy.oopcourse.smartphone.model.IPhone;
import fr.campusacademy.oopcourse.smartphone.model.Smartphone;

public class Launcher {

	public static void main(String[] args) {

		Smartphone smartphone = new Smartphone("iPhone 12", 10);
		System.out.println(smartphone);

		AndroidPhone androidPhone = new AndroidPhone("Samsung A50", 8);
		System.out.println(androidPhone);

		IPhone iPhone = new IPhone("");
	}

}
