package sda2024_03_04_2_zad17_enum;

import util.ConversionType;
import util.MeasurementConverter;

public class Main {

	public static void main(String[] args) {
		int miles = 2;
		MeasurementConverter converter = new MeasurementConverter();
		double kilometers = converter.convert(miles, ConversionType.KILOMETERS_TO_MILES);
		System.out.println(kilometers);
		
		
		int inches = 7;
		System.out.println(converter.convert(inches, ConversionType.INCHES_TO_CENTIMETERS));
	}

}
