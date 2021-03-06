package fr.campusacademy.oopcourse.boardgame.model;

public class Boardgame {

	private int nbOfPlayers;
	private String name;
	private Box box;

	public Boardgame() {

	}

	public Boardgame (int nbOfPlayers, String name, Box box) {

		this.nbOfPlayers = nbOfPlayers;
		this.name = name;
		this.box = box;
	}

	public void start() {

	}

	public void stop() {

	}

	public int getNbOfPlayers() {

		return nbOfPlayers;
	}

	public void setNbOfPlayers(int nbOfPlayers) {

		this.nbOfPlayers = nbOfPlayers;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public Box getBox() {

		return box;
	}

	public void setBox(Box box) {

		this.box = box;
	}

	@Override
	public String toString() {

		return "Boardgame [nbOfPlayers: " + nbOfPlayers + ", name: " + name +"]";
	}

}