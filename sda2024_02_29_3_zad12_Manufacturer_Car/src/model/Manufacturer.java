package model;

import java.util.Objects;

public class Manufacturer {
	/*
	 * nazwa, rok założenia, kraj
	 */
	private String name;
	private int established;
	private String country;
	
	public Manufacturer(String name, int established, String country) {
		super();
		this.name = name;
		this.established = established;
		this.country = country;
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
	 * @return the established
	 */
	public int getEstablished() {
		return established;
	}

	/**
	 * @param established the established to set
	 */
	public void setEstablished(int established) {
		this.established = established;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, established, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Manufacturer))
			return false;
		Manufacturer other = (Manufacturer) obj;
		return Objects.equals(country, other.country) && established == other.established
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Manufacturer [name=" + name + ", established=" + established + ", country=" + country + "]";
	}
	
	
	
}
