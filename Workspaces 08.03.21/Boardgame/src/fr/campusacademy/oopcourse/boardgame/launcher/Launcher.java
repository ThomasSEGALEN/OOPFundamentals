package fr.campusacademy.oopcourse.boardgame.launcher;

import fr.campusacademy.oopcourse.boardgame.model.Boardgame;
import fr.campusacademy.oopcourse.boardgame.model.Box;
import fr.campusacademy.oopcourse.boardgame.model.Cardgame;
import fr.campusacademy.oopcourse.boardgame.model.RolePlayingGame;

public class Launcher {

	public static void main(String[] args) {

		Box squareBox = new Box("Dark blue", 3.0, 7.0);

		Boardgame firstGame = new Boardgame(4, "7wonders", squareBox);
		System.out.println(firstGame);
		
		Cardgame myCardGame = new Cardgame(2, "Love Letter", squareBox);
		System.out.println(myCardGame);
		
		RolePlayingGame myRPG = new RolePlayingGame(6, "Call Of Cthulu", squareBox);
		System.out.println(myRPG);
	}

}