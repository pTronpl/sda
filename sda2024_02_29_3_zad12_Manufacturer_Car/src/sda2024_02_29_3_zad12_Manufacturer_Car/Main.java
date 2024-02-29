package sda2024_02_29_3_zad12_Manufacturer_Car;

import java.util.List;

import model.Car;
import model.EngineType;
import model.Manufacturer;

public class Main {
/*
 * Stwórz klasę Manufacturer, która będzie zawierać pola: nazwa, rok założenia, kraj. 
 * Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj metody hashCode() i equals() .
Stwórz klasę Car, która będzie zawierać pola: nazwa, model, cena, rok produkcji, lista producentów (Manufacturer)
 oraz typ silnika (reprezentowany jako klasa enum, np. V12, V8, V6, S6, S4, S3). 
Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj metody hashcode() i equals().
 */
	public static void main(String[] args) {
		Car c = new Car("Mazda", "CX-5", 170000.0f, 2024, List.of(new Manufacturer("Mazda", 1956, "JPN")), EngineType.H3);
		System.out.println(c.toString());
	}

}
