package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	void test() {
		SumOfNumbers somobject = new SumOfNumbers();
		int actual = somobject.sumOfOddNumbers(6,15);
		int expected = 55;
		assertEquals(actual,expected);
	}
	@Test
	void test2() {
		SumOfNumbers somobject = new SumOfNumbers();
		int actual = somobject.sumOfEvenNumbers(6,15);
		int expected = 50;
		assertEquals(actual,expected);
	}
	@Test
	void test3() {
		SumOfNumbers somobject = new SumOfNumbers();
		int actual = somobject.sumOfEvenNumbers(-10,15);
		int expected = 26;
		assertEquals(actual,expected);
	}@Test
	void test4() {
		SumOfNumbers somobject = new SumOfNumbers();
		int actual = somobject.sumOfOddNumbers(-10,15);
		int expected = 39;
		assertEquals(actual,expected);
	}
	@Test
	void test5() {
		SumOfNumbers somobject = new SumOfNumbers();
		int actual = somobject.sumOfEvenNumbers(-4,-1);
		int expected = -6;
		assertEquals(actual,expected);
	}@Test
	void test6() {
		SumOfNumbers somobject = new SumOfNumbers();
		int actual = somobject.sumOfOddNumbers(-4,-1);
		int expected = -4;
		assertEquals(actual,expected);
	}

}
