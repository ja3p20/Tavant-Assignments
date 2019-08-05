package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorSwitchCaseTest {

	@Test
	void test() {
		String actual = MarkValidatorSwitchCase.markGrade(60);
		String expected = "Grade C";
		assertEquals(actual,expected);
	}
	
	@Test
	void test2() {
		String actual = MarkValidatorSwitchCase.markGrade(85);
		String expected = "Grade B";
		assertEquals(actual,expected);
	}
	@Test
	void test3() {
		String actual = MarkValidatorSwitchCase.markGrade(-29);
		String expected = "Enter valid marks";
		assertEquals(actual,expected);
	}
	@Test
	void test4() {
		String actual = MarkValidatorSwitchCase.markGrade(239);
		String expected = "Enter valid marks";
		assertEquals(actual,expected);
	}
}
