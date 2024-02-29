package service;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.Car;
import model.EngineType;
import model.Manufacturer;

public class CarService {
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
	
	private Set<Car> carList = new HashSet<>();
	
	/**
	 * 
	 * @param c
	 * @return Car list
	 */
	public Set<Car> addCar(Car c) {
		this.carList.add(c);
		return this.carList;
	}
	
	/**
	 * 
	 * @param c
	 * @return Car list
	 */
	public Set<Car> removeCar(Car c) {
		this.carList.remove(c);
		return this.carList;
	}
	
	//zwracanie listy wszystkich aut,
	/**
	 * 
	 * @return Car list
	 */
	public Set<Car> getAll() {
		return this.carList;
	}
	
	//zwracanie aut z silnikiem V12,
	/**
	 * 
	 * @param engineType
	 * @return Car list
	 */
	public Set<Car> getCarByEngine(EngineType engineType) {
		return this.carList.stream().filter(c-> c.getEngine().equals(engineType)).collect(Collectors.toSet());
	}
	
	
	//zwracanie aut wyprodukowanych przed rokiem 1999,
	/**
	 * 
	 * @param year
	 * @return Car list
	 */
	public Set<Car> getCarByEngine(int year) {
		return this.carList.stream().filter(c-> c.getManufactureYear()<year).collect(Collectors.toSet());
	}
		
	
	
	//zwracanie najdroższego auta,
	/**
	 * 
	 * @return the most expensive Car
	 */
	public Car getexpensiveCar() {
		return this.carList.stream()
				.sorted( Comparator.comparing(Car::getPrice) )
				.reduce((first, second) -> second).orElse(null);
	}
	
	
	//zwracanie najtańszego auta,
	/**
	 * 
	 * @return the cheapest Car
	 */
	public Car getCheapestCar() {
		return this.carList.stream()
				.sorted( Comparator.comparing(Car::getPrice) )
				.reduce((first, second) -> first).orElse(null);
	}
	
	//zwracanie auta z co najmniej 3 producentami,
	/**
	 * 
	 * @return Car list
	 */
	public Set<Car> getCarBy3Manufacturers() {
		return this.carList.stream().filter(c-> c.getManufacturerList().size()>=3).collect(Collectors.toSet());
	}
	
	//zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem: rosnąco/malejąco,
	public Car getSortedCarList(boolean ascending) {
		return this.carList.stream()
				.sorted( Comparator.comparing(Car::getName) )
				.reduce((first, second) -> ascending?first:second).orElse(null);
	}
	
	//sprawdzanie czy konkretne auto znajduje się na liście,
	public boolean isCarOnList(Car car) {
		return (this.carList.stream().filter(c-> c.equals(car)).count())==1?true:false;
	}
	
	//zwracanie listy aut wyprodukowanych przez konkretnego producenta,
	/**
	 * @param Manufacturer m
	 * @return Car list
	 */
	public Set<Car> getCarListByManufacturer(Manufacturer m) {
		return this.carList.stream().filter(c-> c.getManufacturerList().contains(m)).collect(Collectors.toSet());
	}
	
	//zwracanie listy aut wyprodukowanych przez producenta z rokiem założenia <,>,<=,>=,==,!= od podanego.
	/**
	 * 
	 * @param Manufacturer m
	 * @param operator <,>,<=,>=,=,!=
	 * @param year
	 * @return
	 */
	public Set<Car> getCarListByManufacturer(Manufacturer m, String operator, int year) {
		Predicate<? super Car> check = c -> {
				return
						switch(operator) {
						case "=" -> c.getManufactureYear()==year;
						case "==" -> c.getManufactureYear()==year;
						case "<" -> c.getManufactureYear()<year;
						case ">" -> c.getManufactureYear()>year;
						case "<=" -> c.getManufactureYear()<=year;
						case ">=" -> c.getManufactureYear()>=year;
						case "!=" -> c.getManufactureYear()!=year;
						default -> false;
						};
		};
		return getCarListByManufacturer(m)
				.stream()
				.filter(check)
				.collect(Collectors.toSet());
	}
	
}
