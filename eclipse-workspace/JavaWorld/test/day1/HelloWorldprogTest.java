package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldprogTest {

	@Test
	void test() {
		String actual = HelloWorldprog.getMessage();
		String expected = "Hello World";
		assertEquals(actual,expected);
	}

}
