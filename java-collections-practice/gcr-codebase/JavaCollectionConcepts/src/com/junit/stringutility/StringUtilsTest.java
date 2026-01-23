package com.junit.stringutility;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	private StringUtils utils;

	@BeforeEach
	void setUp() {
		utils = new StringUtils();
	}

	@Test
	void testReverse() {
		assertEquals("olleh", utils.reverse("hello"));
		assertEquals("", utils.reverse(""));
		assertNull(utils.reverse(null));
	}

	@Test
	void testIsPalindrome() {
		assertTrue(utils.isPalindrome("madam"));
		assertTrue(utils.isPalindrome("level"));
		assertFalse(utils.isPalindrome("hello"));
		assertFalse(utils.isPalindrome(null));
	}

	@Test
	void testToUpperCase() {
		assertEquals("JAVA", utils.toUpperCase("java"));
		assertEquals("TEST", utils.toUpperCase("Test"));
		assertNull(utils.toUpperCase(null));
	}
}
