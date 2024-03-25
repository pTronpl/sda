package dao;

import java.util.UUID;

import util.CreationException;

public class Location {
	private UUID id;
	private double longtitude; // długość geograficzna
	private double latitude; // szerokość geograficzna;
	private String city;
	private String region;
	private String country;
	
	
	public Location(UUID id, double longtitude, double latitude, String city, String region, String country) throws CreationException {
		super();
		
		if (id == null) id = UUID.randomUUID();
		checkValues(id, longtitude, latitude, city,region,country);
		this.id = id;
		this.longtitude = longtitude;
		this.latitude = latitude;
		this.city = city;
		this.region = region;
		this.country = country;
	}

	
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}



	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}



	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}



	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}



	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}



	/**
	 * @return the longtitude
	 */
	public double getLongtitude() {
		return longtitude;
	}



	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}



	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}



	private void checkValues(UUID id, double longtitude, double latitude, String city, String region,
			String country) throws CreationException {
		
		if (longtitude<-180 || longtitude > 180) cee("Nieprawdiłowa długość geograficzna");
		if (latitude<-90 || latitude>90) cee("Nieprawdiłowa szerokość geograficzna");
		if (city == null || city.length() == 0) cee("Nazwa miasta nie może być pusta");
		if (country == null || country.length() == 0) cee("Nazwa kraju nie może być pusta");
	}


	private void cee(String msg) throws CreationException {
		throw new CreationException(msg);
		
	}



	@Override
	public String toString() {
		return "Location [id=" + id + ", longtitude=" + longtitude + ", latitude=" + latitude + ", city=" + city
				+ ", region=" + region + ", country=" + country + "]";
	}
	
	
	
}
