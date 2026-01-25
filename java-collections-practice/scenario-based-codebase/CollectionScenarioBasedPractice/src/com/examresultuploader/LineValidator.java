package com.examresultuploader;

import java.util.regex.Pattern;

public class LineValidator {

	private static final Pattern VALID_LINE = Pattern.compile("\\d+,[A-Za-z ]+,[A-Za-z ]+,\\d{1,3}");

	public static void validate(String line) throws InvalidFormatException {

		if (!VALID_LINE.matcher(line).matches()) {
			throw new InvalidFormatException("Invalid CSV format: " + line);
		}
	}
}
