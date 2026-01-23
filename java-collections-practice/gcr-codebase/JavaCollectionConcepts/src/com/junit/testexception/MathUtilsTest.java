package com.junit.testexception;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	private MathUtils mathUtils;

	@BeforeEach
	void setUp() {
		mathUtils = new MathUtils();
	}

	@Test
	void testDivideByZeroThrowsException() {

		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));

		assertEquals("Division by zero is not allowed", exception.getMessage());
	}

	@Test
	void testDivideSuccessfully() {
		assertEquals(5, mathUtils.divide(10, 2));
	}
}
