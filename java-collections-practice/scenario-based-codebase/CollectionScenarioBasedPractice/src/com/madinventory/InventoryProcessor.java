package com.madinventory;

import java.io.*;
import java.util.*;

public class InventoryProcessor {

	private static final int CRITICAL_LIMIT = 10;

	public Set<InventoryItem<String>> readInventory(String filePath) throws IOException, LowStockException {

		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line;

		Set<InventoryItem<String>> inventorySet = new HashSet<>();

		while ((line = br.readLine()) != null) {

			String[] data = line.split(",");

			String id = data[0];
			String name = data[1];
			int qty = Integer.parseInt(data[2]);
			String expiry = data[3];

			if (!ExpiryValidator.isValidDate(expiry)) {
				System.out.println("Invalid expiry date: " + expiry);
				continue;
			}

			if (qty < CRITICAL_LIMIT) {
				throw new LowStockException("Critical low stock for item: " + name);
			}

			InventoryItem<String> item = new InventoryItem<>(id, name, qty, expiry, name);

			inventorySet.add(item);
		}
		return inventorySet;
	}
}
