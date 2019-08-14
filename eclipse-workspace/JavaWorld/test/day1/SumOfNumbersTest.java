package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	void testsumOfOddNumbersFrom6To15() {
		SumOfNumbers sumOfNumber = new SumOfNumbers();
		int actualsum = sumOfNumber.sumOfOddNumbers(6,15);
		int expectedsum = 55;
		assertEquals(actualsum,expectedsum);
	}
	@Test
	void testsumOfEvenNumbersFrom6To15() {
		SumOfNumbers sumOfNumber = new SumOfNumbers();
		int actualsum = sumOfNumber.sumOfEvenNumbers(6,15);
		int expectedsum = 50;
		assertEquals(actualsum,expectedsum);
	}
	@Test
	void testsumOfEvenNumbersFromNegative10To15() {
		SumOfNumbers sumOfNumber = new SumOfNumbers();
		int actualsum = sumOfNumber.sumOfEvenNumbers(-10,15);
		int expectedsum = 26;
		assertEquals(actualsum,expectedsum);
	}
	@Test
	void testsumOfOddNumbersFromNegative10To15() {
		SumOfNumbers sumOfNumber = new SumOfNumbers();
		int actualsum = sumOfNumber.sumOfOddNumbers(-10,15);
		int expectedsum = 39;
		assertEquals(actualsum,expectedsum);
	}
	@Test
	void testsumOfEvenNumbersFromNegative4ToNegative1() {
		SumOfNumbers sumOfNumber = new SumOfNumbers();
		int actualsum = sumOfNumber.sumOfEvenNumbers(-4,-1);
		int expectedsum = -6;
		assertEquals(actualsum,expectedsum);
	}
	@Test
	void testsumOfOddNumbersFromNegative4ToNegative1() {
		SumOfNumbers sumOfNumber = new SumOfNumbers();
		int actualsum = sumOfNumber.sumOfOddNumbers(-4,-1);
		int expectedsum = -4;
		assertEquals(actualsum,expectedsum);
	}

}
