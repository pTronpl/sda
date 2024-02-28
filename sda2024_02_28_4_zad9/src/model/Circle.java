package model;

import java.util.ArrayList;
import java.util.List;

public class Circle {
	Point2D center;
	Point2D point;
	
	public Circle(Point2D center, Point2D point) {
		super();
		this.center = center;
		this.point = point;
	}
	
	public double getRadius() {
		if(this.center!=null && this.point!=null) {
		return Math.hypot(this.center.getX()-this.point.getX(), this.center.getY()-this.point.getY());
		} else {
			return 0.0;
		}
	}
	
	public double getPerimeter() {
		if(this.center!=null && this.point!=null) {
			return 2*Math.PI * this.getRadius();
		} else {
			return 0.0;
		}
	}
	
	public double getArea() {
		if(this.center!=null && this.point!=null) {
			return Math.PI * Math.pow(this.getRadius(), 2);
		} else {
			return 0.0;
		}
	}
	
	public List<Point2D> getSlicePoints(Point2D p){
		if (Math.hypot(p.getX()-this.center.getX(), p.getY()-this.center.getY())
			!= this.getRadius()	) {
			System.out.println("Point is not on the circle!");
			return new ArrayList<Point2D>();
		} else {
			Point2D p1 = new Point2D(p.getY(), -p.getX() );
			Point2D p2 = new Point2D(-p.getX(), -p.getY());
			Point2D p3 = new Point2D(-p.getY(), p.getX());
			return List.of(p1,p2,p3);
		}
	}
}
