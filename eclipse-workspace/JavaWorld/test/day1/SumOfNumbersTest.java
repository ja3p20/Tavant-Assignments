package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	void test() {
		int actual = SumOfNumbers.sumOfOddNumbers(6,15);
		int expected = 55;
		assertEquals(actual,expected);
	}
	@Test
	void test2() {
		int actual = SumOfNumbers.sumOfEvenNumbers(6,15);
		int expected = 50;
		assertEquals(actual,expected);
	}

}
