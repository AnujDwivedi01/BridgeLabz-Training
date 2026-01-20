package com.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {

		String input = "Hello world, hello Java!";

		// Convert to lowercase and remove punctuation
		input = input.toLowerCase().replaceAll("[^a-z ]", "");

		String[] words = input.split("\\s+");

		Map<String, Integer> map = new HashMap<>();

		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

		System.out.println(map);
	}
}
