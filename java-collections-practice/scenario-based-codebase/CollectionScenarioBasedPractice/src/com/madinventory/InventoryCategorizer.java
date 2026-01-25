package com.madinventory;

import java.util.*;

public class InventoryCategorizer {

	public Map<String, List<InventoryItem<String>>> categorize(Set<InventoryItem<String>> items) {

		Map<String, List<InventoryItem<String>>> categoryMap = new HashMap<>();

		for (InventoryItem<String> item : items) {
			categoryMap.computeIfAbsent(item.getCategory(), k -> new ArrayList<>()).add(item);
		}
		return categoryMap;
	}
}
