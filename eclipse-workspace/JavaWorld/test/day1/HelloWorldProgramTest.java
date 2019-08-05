package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldProgramTest {

	@Test
	void test() {
		String actual = HelloWorldProgram.getMessage();
		String expected = "Hello World";
		assertEquals(actual,expected);
	}

}
