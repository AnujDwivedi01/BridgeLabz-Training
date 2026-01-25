package com.madinventory;

import java.util.*;

public class MedInventory {

	public static void main(String[] args) {

		InventoryProcessor processor = new InventoryProcessor();
		InventoryCategorizer categorizer = new InventoryCategorizer();

		try {
			Set<InventoryItem<String>> inventory = processor.readInventory("D:\\material.csv.xlsx");

			Map<String, List<InventoryItem<String>>> categorized = categorizer.categorize(inventory);

			categorized.forEach((type, list) -> {
				System.out.println("Category: " + type);
				list.forEach(i -> System.out.println(i.getItemName() + " | Qty: " + i.getQuantity()));
			});

		} catch (LowStockException e) {
			System.out.println("⚠ ALERT: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
