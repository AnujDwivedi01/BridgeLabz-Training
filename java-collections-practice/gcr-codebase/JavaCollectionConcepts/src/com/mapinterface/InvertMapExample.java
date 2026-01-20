package com.mapinterface;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InvertMapExample {

	public static void main(String[] args) {

		// Input map
		Map<String, Integer> inputMap = new HashMap<>();
		inputMap.put("A", 1);
		inputMap.put("B", 2);
		inputMap.put("C", 1);

		// Inverted map
		Map<Integer, List<String>> invertedMap = new HashMap<>();

		for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {

			String key = entry.getKey();
			Integer value = entry.getValue();

			// If value not present, create new list
			invertedMap.putIfAbsent(value, new ArrayList<>());

			// Add key to the list
			invertedMap.get(value).add(key);
		}

		System.out.println(invertedMap);
	}
}
