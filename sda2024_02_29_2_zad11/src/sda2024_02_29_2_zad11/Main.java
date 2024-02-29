package sda2024_02_29_2_zad11;

import model.Circle;
import model.MoveDirection;
import model.Point2D;

public class Main {
	/*

ZADANIE 11.
Stwórz interfejs Resizable posiadający metodę resize(double resizeFactor).
Zaimplementuj interfejs w klasie z poprzedniego zadania (Circle). 
Przy wywołaniu metody resize(doubleresizeFactor), 
okrąg ma zmienić swoje rozmiary o zadany współczynnik (1.5, 0.5, 10.0, itp).
Sprawdź poprawność zmiany rozmiaru wywołując pozostałe metody klasy Circle.
	 */

	public static void main(String[] args) {
		Circle c1 = new Circle(new Point2D(0, 0), new Point2D(3, 4));
		
		System.out.println("Radius: " + c1.getRadius());
		System.out.println("Perimeter: " + c1.getPerimeter());
		System.out.println("Area: " + c1.getArea());

		System.out.println("-------------------------------\nSlice Points:\n");
		for (Point2D slicePoint : c1.getSlicePoints(new Point2D(3, 4))) {
			System.out.println(slicePoint.toString());
		}
		
		try {
			for (Point2D slicePoint : c1.getSlicePoints(new Point2D(30, 40))) {
			System.out.println(slicePoint.toString());}
			} catch (Exception e){
				e.printStackTrace();
			}
		
		System.out.println("------------------------------------\n"
				+ "After moving Radius, Perimeter and Area must be the same as original figure");
		
		MoveDirection mD = new MoveDirection(new Point2D(2,-7));
		c1.move(mD);
		System.out.println("Radius: " + c1.getRadius());
		System.out.println("Perimeter: " + c1.getPerimeter());
		System.out.println("Area: " + c1.getArea());
		System.out.println(c1.getCenter().toString());
		System.out.println("After move: " +c1.getPoint().toString());
		
		System.out.println("------------------------------------\n"
				+ "After resizing Radius must be multiplied by the factor"
				+ ", Perimeter must be multiplied by the factor"
				+ " and Area be multiplied by 2 power of the factor");
		c1.resize(2);
		System.out.println("Radius: " + c1.getRadius());
		System.out.println("Perimeter: " + c1.getPerimeter());
		System.out.println("Area: " + c1.getArea());
		System.out.println(c1.getCenter().toString());
		System.out.println("After resize 1: " +c1.getPoint().toString());
		c1.resize(0.5);
		System.out.println("Radius: " + c1.getRadius());
		System.out.println("Perimeter: " + c1.getPerimeter());
		System.out.println("Area: " + c1.getArea());
		System.out.println(c1.getCenter().toString());
		System.out.println("After second resize: " +c1.getPoint().toString());
	}

}
