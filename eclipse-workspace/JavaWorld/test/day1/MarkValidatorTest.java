package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorTest {

	@Test
	void test() {
		MarkValidator mvobj = new MarkValidator();
		mvobj.markGrade(90);
		mvobj.isPass(90);
		String expectedgrade = "A";
		String expectedPF = "Pass";
		assertEquals(expectedgrade,expectedPF);
	}

}
