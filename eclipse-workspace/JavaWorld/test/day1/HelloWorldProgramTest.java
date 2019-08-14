package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldProgramTest {

	@Test
	void testHelloWorld() {
		HelloWorldProgram helloWorldProgram = new HelloWorldProgram();
		String actual = helloWorldProgram.getMessage();
		String expected = "Hello World";
		assertEquals(actual,expected);
	}

}
