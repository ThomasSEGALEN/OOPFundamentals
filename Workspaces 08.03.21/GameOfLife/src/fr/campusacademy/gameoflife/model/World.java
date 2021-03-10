package fr.campusacademy.gameoflife.model;

import java.util.Random;

public class World {

	private Cell[][] cells;

	public World(int nbColumns, int nbRows) {
		cells = new Cell[nbColumns][nbRows];
		Random random = new Random();

		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[i].length; j++) {
				if (i == 0 || j == 0 || i == cells.length - 1 || j == cells.length - 1) {
					cells[i][j] = new DeadCell();
				} else if (random.nextBoolean()) {
					cells[i][j] = new AliveCell();
				} else {
					cells[i][j] = new DeadCell();
				}
			}
		}
	}

	public void newGeneration() {
		int nbNeighbours = 0;

		for (int i = 1; i < cells.length - 1; i++) {
			for (int j = 1; j < cells[i].length - 1; j++) {
				nbNeighbours = 0;
				for (int a = -1; a < 2; a++) {
					for (int b = -1; b < 2; b++) {
						if (!(a == 0 && b == 0)) {
							if (cells[i + a][j + b].isAlive()) {
								nbNeighbours += 1;
							}
						}
					}
				}
				cells[i][j] = cells[i][j].newGeneration(nbNeighbours);
			}
		}
	}

	@Override
	public String toString() {
		String worldStr = "";
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells.length; j++) {
				worldStr += cells[i][j].getAsString();
			}
			worldStr += "\n";
		}
		return worldStr;
	}
}