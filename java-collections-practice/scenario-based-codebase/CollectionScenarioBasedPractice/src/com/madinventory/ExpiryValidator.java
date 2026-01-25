package com.madinventory;

import java.util.regex.Pattern;

public class ExpiryValidator {

	private static final Pattern DATE_PATTERN = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

	public static boolean isValidDate(String date) {
		return DATE_PATTERN.matcher(date).matches();
	}
}
