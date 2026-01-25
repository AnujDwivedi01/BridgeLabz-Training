package com.travellog;

import java.util.regex.*;

public class CityRegexUtil {

	public static boolean containsCity(String text, String city) {
		Pattern p = Pattern.compile("\\b" + city + "\\b", Pattern.CASE_INSENSITIVE);
		return p.matcher(text).find();
	}
}
