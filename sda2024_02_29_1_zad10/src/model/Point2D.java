package model;

public class Point2D implements Movable{
	private double x;
	private double y;
	
	public Point2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
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
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

	@Override
	public Point2D move(MoveDirection moveDirection) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
