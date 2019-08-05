package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		int actual = Factorial.calculateFactorial(5);
		int expected = 120;
		assertEquals(actual,expected);
	}
	@Test
	void test2() {
		int actual = Factorial.calculateFactorial(0);
		int expected = 1;
		assertEquals(actual,expected);
	}
	@Test
	void test3() {
		int actual = Factorial.calculateFactorial(-1);
		int expected = 0;
		assertEquals(actual,expected);
	}
	@Test
	void test4() {
		int actual = Factorial.calculateFactorial(3);
		int expected = 6;
		assertEquals(actual,expected);
	}
}
