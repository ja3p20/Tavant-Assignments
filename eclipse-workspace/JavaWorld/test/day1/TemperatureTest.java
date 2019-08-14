package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void testConvert100degreesCelciusToFarenheit() {
		Double expectedFahrenheit = 212.0;
		Temperature temperature = new Temperature();
		Double actualFahrenheit = temperature.convertToFahrenheit(100.0);
		assertEquals(actualFahrenheit,expectedFahrenheit);
		
	}
	@Test
	void testConvert212degreesFarenheitToCelcius() {
		Double expectedCelsius = 100.0;
		Temperature temperature = new Temperature();
		Double actualCelsius = temperature.convertToCelsius(212.0);
		assertEquals(actualCelsius,expectedCelsius);
	}
	@Test
	void testConvertNegativedegreesCelciusToFarenheit() {
		Double expectedFahrenheit = -22.0;
		Temperature temperature = new Temperature();
		Double actualFahrenheit = temperature.convertToFahrenheit(-30.0);
		assertEquals(actualFahrenheit,expectedFahrenheit);
	}
	@Test
	void testConvertNegativedegreesFarenheitToCelsius() {
		Double expectedCelsius = -67.5;
		Temperature temperature = new Temperature();
		Double actualCelsius = temperature.convertToCelsius(-89.5);
		assertEquals(actualCelsius,expectedCelsius);
	}
	
} 
