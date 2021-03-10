package fr.campusacademy.oopcourse.interfaces.model;

public class MovableRectangle implements Movable {

	private MovablePoint topLeft;
	private MovablePoint bottomRight;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {

		topLeft = new MovablePoint(x1, y1, ySpeed, ySpeed);
		bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	@Override
	public void moveUp() {

		topLeft.y -= topLeft.ySpeed;
		bottomRight.x -= bottomRight.xSpeed;
	}

	@Override
	public void moveDown() {

		topLeft.y += topLeft.ySpeed;
		bottomRight.y += bottomRight.ySpeed;
	}

	@Override
	public void moveLeft() {

		topLeft.y -= topLeft.ySpeed;
		bottomRight.x -= bottomRight.xSpeed;
	}

	@Override
	public void moveRight() {

		topLeft.y += topLeft.ySpeed;
		bottomRight.y += bottomRight.ySpeed;
	}

	@Override
	public String toString() {

		return "Top left: " + topLeft + " - Bottom right: " + bottomRight;
	}

}