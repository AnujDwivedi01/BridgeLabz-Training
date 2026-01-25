package com.feedbackguru;

import java.io.*;
import java.util.*;

public class FeedbackReader {

	public static List<String> readAllFeedback(String folderPath) throws IOException {

		List<String> feedbackList = new ArrayList<>();
		File folder = new File(folderPath);

		for (File file : folder.listFiles()) {
			if (file.getName().endsWith(".txt")) {
				try (BufferedReader br = new BufferedReader(new FileReader(file))) {

					String line;
					while ((line = br.readLine()) != null) {
						feedbackList.add(line);
					}
				}
			}
		}
		return feedbackList;
	}
}
