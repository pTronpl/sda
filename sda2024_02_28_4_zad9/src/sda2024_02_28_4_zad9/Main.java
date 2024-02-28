package sda2024_02_28_4_zad9;

import model.Circle;
import model.Point2D;

public class Main {
	
	/*
	 * ZADANIE 9.
Stwórz klasę Point2D posiadającą pola double x, double y, gettery, settery oraz konstruktor. Następnie stwórz klasę Circle, która będzie miała konstruktor: Circle(Point2D center, Point2D point)
Pierwszy parametr określa środek koła, drugi jest dowolnym punktem na okręgu. Na podstawie tych punktów, klasa Circle ma określać:
• promień okręgu przy wywołaniu metody double getRadius()
• obwód okręgu przy wywołaniu metody double getPerimeter()
• pole okręgu przy wywołaniu metody double getArea()
• (opcjonalne) trzy punkty na okręgu co 90 stopni od punktu podanego przy wywołaniu metody List getSlicePoints() (edited) 
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
		
		for (Point2D slicePoint : c1.getSlicePoints(new Point2D(30, 40))) {
		System.out.println(slicePoint.toString());
	}
	}

}
