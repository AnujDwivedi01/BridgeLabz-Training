package com.resumeanalyzer;

import java.util.regex.*;

public class RegexUtil {

	public static String extractEmail(String text) {
		Matcher m = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}").matcher(text);
		return m.find() ? m.group() : null;
	}

	public static String extractPhone(String text) {
		Matcher m = Pattern.compile("\\b[6-9][0-9]{9}\\b").matcher(text);
		return m.find() ? m.group() : null;
	}
}
