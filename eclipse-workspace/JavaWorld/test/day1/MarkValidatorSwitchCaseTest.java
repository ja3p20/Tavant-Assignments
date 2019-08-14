package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorSwitchCaseTest {

	@Test
	void testFor60Marks() {
		MarkValidatorSwitchCase markValidatorSwitchCase = new MarkValidatorSwitchCase();
		String actual = markValidatorSwitchCase.markGrade(60);
		String expected = "Grade D";
		assertEquals(actual,expected);
	}
	
	@Test
	void testFor85Marks() {
		MarkValidatorSwitchCase markValidatorSwitchCase = new MarkValidatorSwitchCase();
		String actual = markValidatorSwitchCase.markGrade(85);
		String expected = "Grade B";
		assertEquals(actual,expected);
	}
	@Test
	void testForNegativeMarks() {
		MarkValidatorSwitchCase markValidatorSwitchCase = new MarkValidatorSwitchCase();
		String actual = markValidatorSwitchCase.markGrade(-29);
		String expected = "Enter valid marks";
		assertEquals(actual,expected);
	}
	@Test
	void testForMarksGreaterThan100() {
		MarkValidatorSwitchCase markValidatorSwitchCase = new MarkValidatorSwitchCase();
		String actual = markValidatorSwitchCase.markGrade(239);
		String expected = "Enter valid marks";
		assertEquals(actual,expected);
	}
	
}
