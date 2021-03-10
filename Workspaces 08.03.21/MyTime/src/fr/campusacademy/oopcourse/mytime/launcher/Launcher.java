package fr.campusacademy.oopcourse.mytime.launcher;

import fr.campusacademy.oopcourse.mytime.model.MyTime;

public class Launcher {

	public static void main(String[] args) throws InterruptedException {
		MyTime timer1 = new MyTime(5, 58, 35);
		System.out.println(timer1);
		MyTime timer2 = new MyTime(5, 24, 26);

		for (int i = 1000; i > 0; i++) {
			System.out.println("Clock:");
			timer1.nextSecond().nextMinute();
			System.out.println(timer1);
			Thread.sleep(100);
		}
	}
}