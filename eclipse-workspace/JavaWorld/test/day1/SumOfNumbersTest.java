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
	@Test
	void test3() {
		int actual = SumOfNumbers.sumOfEvenNumbers(-10,15);
		int expected = 26;
		assertEquals(actual,expected);
	}@Test
	void test4() {
		int actual = SumOfNumbers.sumOfOddNumbers(-10,15);
		int expected = 39;
		assertEquals(actual,expected);
	}
	@Test
	void test5() {
		int actual = SumOfNumbers.sumOfEvenNumbers(-4,-1);
		int expected = -6;
		assertEquals(actual,expected);
	}@Test
	void test6() {
		int actual = SumOfNumbers.sumOfOddNumbers(-4,-1);
		int expected = -4;
		assertEquals(actual,expected);
	}

}
