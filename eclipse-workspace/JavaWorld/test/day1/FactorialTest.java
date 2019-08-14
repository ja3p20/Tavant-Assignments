package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void testFactorialOf5() {
		Factorial factorial = new Factorial();
		int actual = factorial.calculateFactorial(5);
		int expected = 120;
		assertEquals(actual,expected);
	}
	@Test
	void testFactorialOf0() {
		Factorial factorial = new Factorial();
		int actual = factorial.calculateFactorial(0);
		int expected = 1;
		assertEquals(actual,expected);
	}
	@Test
	void testFactorialOfNegative1() {
		Factorial factorial = new Factorial();
		int actual = factorial.calculateFactorial(-1);
		int expected = 0;
		assertEquals(actual,expected);
	}
	@Test
	void testFactorialOfNegative5() {
		Factorial factorial = new Factorial();
		int actual = factorial.calculateFactorial(-5);
		int expected = 0;
		assertEquals(actual,expected);
	}
	@Test
	void testFactorialOf1() {
		Factorial factorial = new Factorial();
		int actual = factorial.calculateFactorial(1);
		int expected = 1;
		assertEquals(actual,expected);
	}
}
