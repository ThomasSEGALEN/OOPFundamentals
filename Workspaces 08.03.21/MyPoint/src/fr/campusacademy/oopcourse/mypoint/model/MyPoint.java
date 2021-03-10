package fr.campusacademy.oopcourse.mypoint.model;

public class MyPoint {
	private int x = 0;
	private int y = 0;

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int[] getXY() {
		return new int[] { this.x, this.y };
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "[x= " + x + ", y= " + y + "]";
	}

	public double distance() {
		return this.distance(0, 0);
//		return 0.0;
	}

	public double distance(int x, int y) {
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public double distance(MyPoint another) {
		return this.distance(another.x, another.y);
//		int xDiff = this.x - another.x;
//		int yDiff = this.y - another.y;
//		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
}
