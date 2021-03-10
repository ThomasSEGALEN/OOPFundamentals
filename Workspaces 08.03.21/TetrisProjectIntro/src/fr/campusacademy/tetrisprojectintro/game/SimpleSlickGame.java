package fr.campusacademy.tetrisprojectintro.game;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class SimpleSlickGame extends BasicGame {
	public SimpleSlickGame(String gamename) {
		super(gamename);
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
	}

	@Override
	public void update(GameContainer gc, int i) throws SlickException {
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		g.drawString("Howdy!", 100, 100);
	}

	public int[][] TetriminosS = {
			{0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,0,1,1,0,0,0,0,0},
			{0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,0},
			{0,0,0,0,0,0,1,1,0,1,1,0,0,0,0,0}
	};
	public int[][] TetriminosO = {
			{0,2,2,0,0,2,2,0,0,0,0,0,0,0,0,0},
			{0,2,2,0,0,2,2,0,0,0,0,0,0,0,0,0},
			{0,2,2,0,0,2,2,0,0,0,0,0,0,0,0,0},
			{0,2,2,0,0,2,2,0,0,0,0,0,0,0,0,0}
	};
	public int[][] TetriminosI = {
			{0,3,0,0,0,3,0,0,0,3,0,0,0,3,0,0},
			{3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,3,0,0,0,3,0,0,0,3,0,0,0,3,0,0},
			{3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0},
	};
	public int[][] TetriminosZ = {
			{0,0,4,0,0,4,4,0,0,4,0,0,0,0,0,0},
			{0,0,0,0,0,4,4,0,0,0,4,4,0,0,0,0},
			{0,0,4,0,0,4,4,0,0,4,0,0,0,0,0,0},
			{0,0,0,0,0,4,4,0,0,0,4,4,0,0,0,0}
	};
	public int[][] TetriminosT = {
			{0,5,0,0,0,5,5,0,0,5,0,0,0,0,0,0},
			{0,0,0,0,0,0,5,0,0,5,5,5,0,0,0,0},
			{0,0,0,5,0,0,5,5,0,0,0,5,0,0,0,0},
			{0,5,5,5,0,0,5,0,0,0,0,0,0,0,0,0}
	};
	public int[][] TetriminosJ = {
			{0,0,6,0,0,0,6,0,0,6,6,0,0,0,0,0},
			{0,0,0,0,0,6,6,6,0,0,0,6,0,0,0,0},
			{0,6,6,0,0,6,0,0,0,6,0,0,0,0,0,0},
			{0,0,0,0,0,6,0,0,0,6,6,6,0,0,0,0}
	};
	public int[][] TetriminosL = {
			{0,7,0,0,0,7,0,0,0,7,7,0,0,0,0,0},
			{0,0,0,0,0,0,0,7,0,7,7,7,0,0,0,0},
			{0,7,7,0,0,0,7,0,0,0,7,0,0,0,0,0},
			{0,0,0,0,0,7,7,7,0,7,0,0,0,0,0,0}
	};
	
}