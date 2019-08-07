package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() {
		
		Double expected = 212.0;
		Temperature tempobject = new Temperature();
		Double actual = tempobject.convertToFahrenheit(100.0);
		assertEquals(actual,expected);
		
	}
	@Test
	void test2() {
		Double expected = 100.0;
		Temperature tempobject = new Temperature();
		Double actual = tempobject.convertToCelsius(212.0);
		assertEquals(actual,expected);
	}
	@Test
	void test3() {
		Double expected = -67.5;
		Temperature tempobject = new Temperature();
		Double actual = tempobject.convertToCelsius(-89.5);
		assertEquals(actual,expected);
	}
	@Test
	void test4() {
		Double expected = 94.28;
		Temperature tempobject = new Temperature();
		Double actual = tempobject.convertToFahrenheit(34.6);
		assertEquals(actual,expected);
	}
}
