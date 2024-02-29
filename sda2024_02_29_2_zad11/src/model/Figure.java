package model;

public abstract class Figure implements Movable, Resizable{
	private Point2D center;
	private Point2D point;
	
	abstract public Point2D getCenter();
	abstract public Point2D move(MoveDirection md);
}