package fr.campusacademy.gameoflifecorrection.model;

public interface Cell {
	Cell newGeneration(int nbNeighbours);
	String getAsString();
	boolean isAlive();
}