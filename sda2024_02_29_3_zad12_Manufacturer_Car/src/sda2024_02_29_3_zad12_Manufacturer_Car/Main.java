package sda2024_02_29_3_zad12_Manufacturer_Car;

import java.util.List;

import model.Car;
import model.EngineType;
import model.Manufacturer;
import service.CarService;

public class Main {
/*
 * ZADANIE 12.
 * Stwórz klasę Manufacturer, która będzie zawierać pola: nazwa, rok założenia, kraj. 
 * Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj metody hashCode() i equals() .
Stwórz klasę Car, która będzie zawierać pola: nazwa, model, cena, rok produkcji, lista producentów (Manufacturer)
 oraz typ silnika (reprezentowany jako klasa enum, np. V12, V8, V6, S6, S4, S3). 
Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj metody hashcode() i equals().
 */
	
	/*
	 * ZADANIE 13.
Stwórz klasę CarService, która będzie zawierać w sobie listę aut, oraz będzie realizować poniższe metody:
dodawanie aut do listy,
usuwanie auta z listy,
zwracanie listy wszystkich aut,
zwracanie aut z silnikiem V12,
zwracanie aut wyprodukowanych przed rokiem 1999,
zwracanie najdroższego auta,
zwracanie najtańszego auta,
zwracanie auta z co najmniej 3 producentami,
zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem: rosnąco/malejąco,
sprawdzanie czy konkretne auto znajduje się na liście,
zwracanie listy aut wyprodukowanych przez konkretnego producenta,
zwracanie listy aut wyprodukowanych przez producenta z rokiem założenia <,>,<=,>=,=,!= od podanego.
	 */
	public static void main(String[] args) {
		Car c = new Car("Mazda", "CX-5", 170000.0f, 2024, List.of(new Manufacturer("Mazda", 1956, "JPN")), EngineType.H3);
//		System.out.println(c.toString());
		
		Manufacturer toyota = new Manufacturer("Toyota", 1949, "JPN");
		
		CarService cs = new CarService();
		cs.addCar(c);
		
		Car c1 = new Car("Toyota", "Toyota", 298000.0f, 2024, List.of(toyota), EngineType.H3);
		cs.addCar(c1);
		
		Car c2 = new Car("Jaguar", "XF", 370000.0f, 2024, List.of(new Manufacturer("Jaguar", 1934, "GB")), EngineType.V12);
		cs.addCar(c2);
		
		Car c3 = new Car("Toyota", "Toyota", 165000.0f, 2015, List.of(toyota), EngineType.S3);
		cs.addCar(c3);
		
		
		System.out.println("H3 engine:  " + cs.getCarByEngine(EngineType.H3).toString());
		
		System.out.println("The cheapest: " + cs.getCheapestCar().toString());
		System.out.println("The most expensive: " + cs.getexpensiveCar().toString());
		
		System.out.println("Najtrudniejsze sprawdzenie: toyota < 2020 : \n" 
					+ cs.getCarListByManufacturer(toyota, "<", 2020));
		System.out.println("Najtrudniejsze sprawdzenie: toyota >= 2020 : \n" 
				+ cs.getCarListByManufacturer(toyota, ">=", 2020));
		
		
		// pozostałe metody do sprawdzenia
	}

}
