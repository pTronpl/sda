package util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MeasurementConverterTest {
	@BeforeEach
	void setUp() throws Exception {
		MeasurementConverter mC = new MeasurementConverter();
	}

	@Test
	void testConvert() {
		MeasurementConverter mC = new MeasurementConverter();
		int inches = 2;
		assertEquals(5.08d, mC.convert(inches, ConversionType.INCHES_TO_CENTIMETERS) , 0.0001);
		assertNotEquals(5.0802d, mC.convert(inches, ConversionType.INCHES_TO_CENTIMETERS) , 0.0001);
		
		int centimeters = 254;
		assertEquals(100.0d, mC.convert(centimeters, ConversionType.CENTIMETERS_TO_ICHES) , 0.0001);
		
		int miles = 2;
		assertEquals(3.218688d, mC.convert(miles, ConversionType.MILES_TO_KILOMETERS) , 0.0001);
		
		int km = 2;
		assertEquals(1.2427423844d, mC.convert(km, ConversionType.KILOMETERS_TO_MILES) , 0.0001);
		
		int meter = 10;
		assertEquals(10.9360d, mC.convert(meter, ConversionType.METERS_TO_YARDS) , 0.0001);
		
		int yards = 10;
		assertEquals(9.144d, mC.convert(yards, ConversionType.YARDS_TO_METERS) , 0.0001);
	}

}
