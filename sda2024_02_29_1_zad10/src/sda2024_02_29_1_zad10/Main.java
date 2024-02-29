package sda2024_02_29_1_zad10;

import model.Circle;
import model.MoveDirection;
import model.Point2D;

public class Main {
	/*
	 * ZADANIE 10.
Stwórz klasę MoveDirection posiadającą pola double x, double y oraz gettery, settery i konstruktor. 
Stwórz interfejs Movable posiadający metodę move(MoveDirection moveDirection).
Zaimplementuj interfejs w klasach z poprzedniego zadania (Point2D oraz Circle). 
Przy wywołaniu metody move(MoveDirection moveDirection), 
obiekty mają zmienić swoje położenie na podstawie przekazanego kierunku (MoveDirection).
Sprawdź poprawność przesunięcia wywołując pozostałe metody klasy Circle.
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
		
	}

}