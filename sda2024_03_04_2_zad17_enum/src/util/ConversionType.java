package util;
/*
 * Stwórz klasę enum ConversionType ze stałymi 
 * METERS_TO_YARDS, 
 * YARDS_TO_METERS, 
 * CENTIMETERS_TO_ICHES, 
 * INCHES_TO_CENTIMETERS, 
 * KILOMETERS_TO_MILES, 
 * MILES_TO_KILOMETERS.
Enum powinien posiadać parametr typu Converter służący do przeprowadzania obliczeń dla danego typu.
Następnie stwórz klasę MeasurementConverter, 
która będzie posiadała metodę convert(int value, ConvertionType conversionType) 
i na podstawie przekazanej wartości oraz typu konwersji, korzystała z Convertera danego typu i zwracała wynik.
 */
public enum ConversionType {
	METERS_TO_YARDS(1.0936d), 
	YARDS_TO_METERS(0.9144d), 
	CENTIMETERS_TO_ICHES(0.3937007874d), 
	INCHES_TO_CENTIMETERS(2.54d), 
	KILOMETERS_TO_MILES(0.6213711922d), 
	MILES_TO_KILOMETERS(1.609344d);
	
	ConversionType(double factor){
		this.factor = factor;
	}
	private double factor;
	
	static double getConverter(ConversionType cT) {
		return cT.factor;
	}
}
