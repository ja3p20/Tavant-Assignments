package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldProgramTest {

	@Test
	void test() {
		HelloWorldProgram hwobj = new HelloWorldProgram();
		String actual = hwobj.getMessage();
		String expected = "Hello World";
		assertEquals(actual,expected);
	}

}
