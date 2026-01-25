package com.feedbackguru;

import java.util.*;

public class FeedbackGuru {

	public static void main(String[] args) {

		Map<String, List<Feedback<String>>> feedbackMap = new HashMap<>();

		feedbackMap.put("Positive", new ArrayList<>());
		feedbackMap.put("Neutral", new ArrayList<>());
		feedbackMap.put("Negative", new ArrayList<>());

		try {
			List<String> feedbackLines = FeedbackReader.readAllFeedback("feedbacks");

			for (String line : feedbackLines) {
				try {
					int rating = RatingExtractor.extractRating(line);

					String category;
					if (rating >= 8) {
						category = "Positive";
					} else if (rating >= 5) {
						category = "Neutral";
					} else {
						category = "Negative";
					}

					Feedback<String> fb = new Feedback<>("Service", line, rating);

					feedbackMap.get(category).add(fb);

				} catch (Exception e) {
					// Invalid or missing rating → safely skipped
					System.out.println("Skipped line: " + line);
				}
			}

		} catch (Exception e) {
			System.out.println("File error: " + e.getMessage());
		}

		// 🔍 Display Summary
		System.out.println("\n📊 Feedback Summary");
		feedbackMap.forEach((k, v) -> {
			System.out.println(k + " Feedback:");
			v.forEach(System.out::println);
			System.out.println();
		});
	}
}
