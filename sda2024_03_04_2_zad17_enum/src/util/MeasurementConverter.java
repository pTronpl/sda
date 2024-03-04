package util;

public class MeasurementConverter {

	public double convert(int value, ConversionType conversionType) {
		return value * ConversionType.getConverter(conversionType);
	}
}
