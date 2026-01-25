package com.examscanner;

import java.util.regex.Pattern;

public class AnswerValidator {

	private static final Pattern VALID_PATTERN = Pattern.compile("^[A-Za-z ]+(,[ABCD])+$");

	public static boolean isValidFormat(String line) {
		return VALID_PATTERN.matcher(line).matches();
	}
}
