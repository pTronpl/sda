package model;

public class MoveDirection {
	double x;
	double y;
	
	public MoveDirection(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public MoveDirection(Point2D vector) {
		super();
		this.x = vector.getX();
		this.y = vector.getY();
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "MoveDirection [x=" + x + ", y=" + y + "]";
	}



}
