package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorSwitchCaseTest {

	@Test
	void test() {
		MarkValidatorSwitchCase mvobject = new MarkValidatorSwitchCase();
		String actual = mvobject.markGrade(60);
		String expected = "Grade C";
		assertEquals(actual,expected);
	}
	
	@Test
	void test2() {
		MarkValidatorSwitchCase mvobject = new MarkValidatorSwitchCase();
		String actual = mvobject.markGrade(85);
		String expected = "Grade B";
		assertEquals(actual,expected);
	}
	@Test
	void test3() {
		MarkValidatorSwitchCase mvobject = new MarkValidatorSwitchCase();
		String actual = mvobject.markGrade(-29);
		String expected = "Enter valid marks";
		assertEquals(actual,expected);
	}
	@Test
	void test4() {
		MarkValidatorSwitchCase mvobject = new MarkValidatorSwitchCase();
		String actual = mvobject.markGrade(239);
		String expected = "Enter valid marks";
		assertEquals(actual,expected);
	}
}
