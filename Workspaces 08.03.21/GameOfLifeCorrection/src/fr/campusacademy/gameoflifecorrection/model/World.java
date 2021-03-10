package fr.campusacademy.gameoflifecorrection.model;

import java.util.Random;

public class World {

	private Cell[][] cells;
	
	public World(int nbColumns, int nbRows) {
		
//		cells = new Cell[nbColumns][nbRows];
		cells = null;
		
		try {
			cells = new Cell[nbColumns][nbRows];
		} catch (NegativeArraySizeException e) {
			System.out.println("InvalidArgumentException");
			System.out.println("Your value isn't positive - Choose an int between 1 and 500");
		}
		
		Random random = new Random();
		
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[i].length; j++) {
				if (random.nextBoolean()) {
					cells[i][j] = new AliveCell();
				} else {
					cells[i][j] = new DeadCell();
				}
				
			}
		}
	}
	
	
	public void newGeneration() {
		
		Cell[][] tempCells = new Cell[cells.length][cells[0].length];
		
		
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[i].length; j++) {
				
				int nbNeightbours = countNbNeighbours(i,j);
				Cell nextGenerationCell = cells[i][j].newGeneration(nbNeightbours);
				
				tempCells[i][j] = nextGenerationCell;
			}
			
		}
		
		cells = tempCells;
	}
	
	public int countNbNeighbours(int i, int j) {
		int counter = 0;
		
		for(int u = -1; u <= 1; u++) {
			for(int v = -1; v <= 1; v++) {

				int xNeighbour = u + i;
				int yNeighbour = v + j;
				
				if (xNeighbour >= 0 
						&& yNeighbour >= 0 
						&& xNeighbour < cells.length 
						&& yNeighbour < cells[0].length) {
					if (u != 0 || v != 0) {
						if (cells[xNeighbour][yNeighbour].isAlive()) {
							counter++;
						}
					}
				}

			}
		}
		
		return counter;
	}
	

	@Override
	public String toString() {
		String worldStr = "";

		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[i].length; j++) {
				worldStr += cells[i][j].getAsString();
			}
			worldStr += "\n";
		}
		
		return worldStr;
	}
	
}
