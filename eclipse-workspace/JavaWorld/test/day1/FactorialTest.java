package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		//Factorial factobj = new Factorial();
		int actual = Factorial.calculateFactorial(5);
		int expected = 120;
		assertEquals(actual,expected);
	}
	@Test
	void test2() {
		//Factorial factobj = new Factorial();
		int actual = Factorial.calculateFactorial(0);
		int expected = 1;
		assertEquals(actual,expected);
	}
}
