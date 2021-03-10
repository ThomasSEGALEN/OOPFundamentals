package fr.campusacademy.oopcourse.demo_6_computer.launcher;

import fr.campusacademy.oopcourse.demo_6_computer.model.Computer;
import fr.campusacademy.oopcourse.demo_6_computer.model.GPU;

public class Launcher {

	public static void main(String[] args) {

//		GPU myGPU = new GPU("RTX3080", "NVIDIA", 8704);

//		Computer myPC = new Computer("MySuperPC", myGPU);

		Computer mySecondPC = new Computer("MySuperPC2", new GPU("RTX3080", "NVIDIA", 8704));

		mySecondPC.setName("My New Second Name");

		System.out.println(mySecondPC.getName());
		System.out.println(mySecondPC.getGraphicalCard().getModel());
		System.out.println(mySecondPC.getGraphicalCard().getBrand());
		System.out.println(mySecondPC.getGraphicalCard().getNbOfCores());

		System.out.println(mySecondPC);
	}
}
