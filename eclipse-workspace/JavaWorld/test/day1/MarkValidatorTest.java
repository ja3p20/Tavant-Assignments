package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorTest {
	
	@Test
	void test() {
		MarkValidator mvobj = new MarkValidator();
		mvobj.isPass(90);
		mvobj.markGrade(90);
		String expectedgrade = "A";
		String actualgrade = "A";
		String expectedPF = "Pass";
		String actualPF = "Pass";
		assertEquals(actualgrade,expectedgrade);
		assertEquals(actualPF,expectedPF);
	}
	@Test
	void test2() {
		MarkValidator mvobj = new MarkValidator();
		mvobj.isPass(-123);
		String expectedgrade = "Please enter valid marks";
		String actualgrade = "Please enter valid marks";
		assertEquals(actualgrade,expectedgrade);
		
	}
	@Test
	void test3() {
		MarkValidator mvobj = new MarkValidator();
		mvobj.isPass(400);
		String expectedgrade = "Please enter valid marks";
		String actualgrade = "Please enter valid marks";
		assertEquals(actualgrade,expectedgrade);
		
	}


}
