package model;

public enum EngineType {

	V12("gasoline"), V8("gasoline"), V6("gasoline"), 
	S6("diesel"), S4("diesel"), S3("diesel"),
	E1("electric"), H3("hybrid"), H7("hybrid");
	
	
	
	private EngineType(String fuelType) {
		this.fuelType = fuelType;
	}

	private String fuelType;

	/**
	 * @return the fuelType
	 */
	public String getFuelType() {
		return fuelType;
	}
	
	
}
