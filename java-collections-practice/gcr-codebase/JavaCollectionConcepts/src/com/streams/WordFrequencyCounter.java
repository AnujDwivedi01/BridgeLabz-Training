package com.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequencyCounter {

	public static void main(String[] args) {

		HashMap<String, Integer> wordCountMap = new HashMap<>();
		BufferedReader br = null;
		int totalWords = 0;

		try {
			br = new BufferedReader(new FileReader("D:\\filehandling\\file11.txt"));
			String line;

			while ((line = br.readLine()) != null) {

				// Convert to lowercase to avoid case issues
				line = line.toLowerCase();

				// Split line into words (remove punctuation)
				String[] words = line.split("[^a-zA-Z]+");

				for (String word : words) {
					if (!word.isEmpty()) {
						totalWords++;

						if (wordCountMap.containsKey(word)) {
							wordCountMap.put(word, wordCountMap.get(word) + 1);
						} else {
							wordCountMap.put(word, 1);
						}
					}
				}
			}

		} catch (IOException e) {
			System.out.println("Error reading the file.");
			e.printStackTrace();

		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				System.out.println("Error closing the file.");
			}
		}

		// Display total word count
		System.out.println("Total number of words: " + totalWords);

		// Sort the words by frequency
		List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCountMap.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
				return e2.getValue() - e1.getValue(); // descending order
			}
		});

		// Display top 5 words
		System.out.println("\nTop 5 most frequent words:");
		int count = 0;

		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			count++;

			if (count == 5)
				break;
		}
	}
}
