package com.feedbackguru;

import java.util.regex.*;

public class RatingExtractor {

	public static int extractRating(String line) {
		Pattern p = Pattern.compile("(\\d{1,2})/10");
		Matcher m = p.matcher(line);

		if (m.find()) {
			return Integer.parseInt(m.group(1));
		}
		throw new IllegalArgumentException("Rating not found");
	}
}
