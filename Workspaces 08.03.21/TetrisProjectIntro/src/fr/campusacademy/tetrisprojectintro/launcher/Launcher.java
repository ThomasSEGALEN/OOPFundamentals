package fr.campusacademy.tetrisprojectintro.launcher;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import fr.campusacademy.tetrisprojectintro.game.SimpleSlickGame;

public class Launcher {

	public static void main(String[] args) {
		try {
			AppGameContainer appgc;
			appgc = new AppGameContainer(new SimpleSlickGame("Simple Slick Game"));
			appgc.setDisplayMode(640, 480, false);
			appgc.setTargetFrameRate(60);
			Input.disableControllers();
			appgc.start();
		} catch (SlickException ex) {
			Logger.getLogger(SimpleSlickGame.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
