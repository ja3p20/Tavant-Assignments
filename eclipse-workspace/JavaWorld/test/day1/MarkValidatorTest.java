package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorTest {
	
	@Test
	void test() {
		MarkValidator mvobj = new MarkValidator();
		String expectedgrade = "A";
		String actualgrade = mvobj.markGrade(90);
		String expectedPF = "Pass";
		String actualPF = mvobj.isPass(90);
		assertEquals(actualgrade,expectedgrade);
		assertEquals(actualPF,expectedPF);
	}
	@Test
	void test2() {
		MarkValidator mvobj = new MarkValidator();
		
		String expectedgrade = "Please enter valid marks";
		String actualgrade = mvobj.isPass(-123);
		assertEquals(actualgrade,expectedgrade);
		
	}
	@Test
	void test3() {
		MarkValidator mvobj = new MarkValidator();
		String expectedgrade = "Please enter valid marks";
		String actualgrade = mvobj.isPass(400);
		assertEquals(actualgrade,expectedgrade);
		
	}


}
