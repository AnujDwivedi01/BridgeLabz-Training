package com.listinterface;

import java.util.*;

public class FrequencyOfElements {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");

		Map<String, Integer> frequencyMap = new HashMap<>();

		for (String fruit : fruits) {
			if (frequencyMap.containsKey(fruit)) {
				frequencyMap.put(fruit, frequencyMap.get(fruit) + 1);
			} else {
				frequencyMap.put(fruit, 1);
			}
		}

		System.out.println(frequencyMap);
	}
}
