package fr.campusacademy.gameoflifecorrection.model;

public class AliveCell implements Cell {

	@Override
	public Cell newGeneration(int nbNeighbours) {
		if (nbNeighbours == 2 || nbNeighbours == 3) {
			return new AliveCell();
		}

		return new DeadCell();
	}

	@Override
	public String getAsString() {
		return " 0 ";
	}

	@Override
	public boolean isAlive() {
		return true;
	}

}
