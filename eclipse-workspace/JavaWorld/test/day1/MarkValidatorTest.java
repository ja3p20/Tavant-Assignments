package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorTest {
	
	@Test
	void testFor90Marks() {
		MarkValidator markValidator = new MarkValidator();
		String actualgrade = markValidator.markGrade(90);
		String expectedgrade = "Grade B";
		assertEquals(actualgrade,expectedgrade);
		boolean actualPassFailCondition = markValidator.isPass(90);
		boolean expectedPassFailCondition = true;
		assertEquals(actualPassFailCondition,expectedPassFailCondition);
	}
	@Test
	void testFor75Marks() {
		MarkValidator markValidator = new MarkValidator();
		String actualgrade = markValidator.markGrade(75);
		String expectedgrade = "Grade C";
		assertEquals(actualgrade,expectedgrade);
		boolean actualPassFailCondition = markValidator.isPass(75);
		boolean expectedPassFailCondition = true;
		assertEquals(actualPassFailCondition,expectedPassFailCondition);
	}
	@Test
	void testFor60Marks() {
		MarkValidator markValidator = new MarkValidator();
		String actualgrade = markValidator.markGrade(60);
		String expectedgrade = "Grade D";
		assertEquals(actualgrade,expectedgrade);
		boolean actualPassFailCondition = markValidator.isPass(60);
		boolean expectedPassFailCondition = true;
		assertEquals(actualPassFailCondition,expectedPassFailCondition);
	}
	@Test
	void testFor35Marks() {
		MarkValidator markValidator = new MarkValidator();
		String actualgrade = markValidator.markGrade(35);
		String expectedgrade = "Fail";
		assertEquals(actualgrade,expectedgrade);
		boolean actualPassFailCondition = markValidator.isPass(35);
		boolean expectedPassFailCondition = false;
		assertEquals(actualPassFailCondition,expectedPassFailCondition);
	}
	@Test
	void testForNegativeMarks() {
		MarkValidator markValidator = new MarkValidator();
		String actualgrade = markValidator.markGrade(-123);
		String expectedgrade = "Enter Valid Marks to Calculate Grade";
		assertEquals(actualgrade,expectedgrade);
		boolean actualPassFailCondition = markValidator.isPass(-123);
		boolean expectedPassFailCondition = false;
		assertEquals(actualPassFailCondition,expectedPassFailCondition);
		
	}
	@Test
	void testForMarksGreaterThan100() {
		MarkValidator markValidator = new MarkValidator();
		String actualgrade = markValidator.markGrade(400);
		String expectedgrade = "Enter Valid Marks to Calculate Grade";
		assertEquals(actualgrade,expectedgrade);
		boolean actualPassFailCondition = markValidator.isPass(400);
		boolean expectedPassFailCondition = true;
		assertEquals(actualPassFailCondition,expectedPassFailCondition);	
	}


}
