package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidator2Test {

	@Test
	void test() {
		String actual = MarkValidator2.markGrade(60);
		String expected = "D";
		assertEquals(actual,expected);
	}
	
	@Test
	void test2() {
		String actual = MarkValidator2.markGrade(85);
		String expected = "B";
		assertEquals(actual,expected);
	}

}
