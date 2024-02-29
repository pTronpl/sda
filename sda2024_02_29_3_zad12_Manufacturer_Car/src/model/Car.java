package model;

import java.util.List;
import java.util.Objects;

public class Car {
//nazwa, model, cena, rok produkcji, lista producentów (Manufacturer), oraz typ silnika
	
	private String name;
	private String model;
	private float price;
	private int maufactureYear;
	private List<Manufacturer> manufacturerList;
	private EngineType engine;
	
	public Car(String name, String model, float price, int maufactureYear, List<Manufacturer> manufacturerList,
			EngineType engine) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		this.maufactureYear = maufactureYear;
		this.manufacturerList = manufacturerList;
		this.engine = engine;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the maufactureYear
	 */
	public int getMaufactureYear() {
		return maufactureYear;
	}

	/**
	 * @param maufactureYear the maufactureYear to set
	 */
	public void setMaufactureYear(int maufactureYear) {
		this.maufactureYear = maufactureYear;
	}

	/**
	 * @return the manufacturerList
	 */
	public List<Manufacturer> getManufacturerList() {
		return manufacturerList;
	}

	/**
	 * @param manufacturerList the manufacturerList to set
	 */
	public void setManufacturerList(List<Manufacturer> manufacturerList) {
		this.manufacturerList = manufacturerList;
	}

	/**
	 * @return the engine
	 */
	public EngineType getEngine() {
		return engine;
	}

	/**
	 * @param engine the engine to set
	 */
	public void setEngine(EngineType engine) {
		this.engine = engine;
	}

	@Override
	public int hashCode() {
		return Objects.hash(engine, manufacturerList, maufactureYear, model, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Car))
			return false;
		Car other = (Car) obj;
		return engine == other.engine && Objects.equals(manufacturerList, other.manufacturerList)
				&& maufactureYear == other.maufactureYear && Objects.equals(model, other.model)
				&& Objects.equals(name, other.name) && Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", price=" + price + ", maufactureYear=" + maufactureYear
				+ ", manufacturerList=" + manufacturerList + ", engine=" + engine+"/"+engine.getFuelType() + "]";
	}
	
	
}
