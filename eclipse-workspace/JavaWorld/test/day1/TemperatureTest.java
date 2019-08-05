package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() {
		
		Double expected1 = 212.0;
		//double expected1 = sc.nextDouble();
		Double actual1 = Temperature.convertToFahrenheit(100.0);
		assertEquals(actual1,expected1);
		
	}
	@Test
	void test2() {
		Double expected2 = 100.0;
		//double expected2 = sc.nextDouble();
		Double actual2 = Temperature.convertToCelsius(212.0);
		assertEquals(actual2,expected2);
	}
	@Test
	void test3() {
		Double expected2 = -67.5;
		//double expected2 = sc.nextDouble();
		Double actual2 = Temperature.convertToCelsius(-89.5);
		assertEquals(actual2,expected2);
	}
	@Test
	void test4() {
		Double expected2 = 94.28;
		//double expected2 = sc.nextDouble();
		Double actual2 = Temperature.convertToFahrenheit(34.6);
		assertEquals(actual2,expected2);
	}
}
