package com.smartcheckout;

import java.util.*;

class SmartCheckout {

	private Queue<Customer> customerQueue = new LinkedList<>();
	private HashMap<String, Item> itemMap = new HashMap<>();

	public SmartCheckout() {
		// Sample items
		itemMap.put("Milk", new Item(50, 10));
		itemMap.put("Bread", new Item(30, 15));
		itemMap.put("Rice", new Item(60, 20));
	}

	// Add customer
	public void addCustomer(Customer customer) {
		customerQueue.offer(customer);
		System.out.println(customer.name + " added to billing queue.");
	}

	// Process billing
	public void processBilling() {

		if (customerQueue.isEmpty()) {
			System.out.println("No customers in queue.");
			return;
		}

		Customer customer = customerQueue.poll();
		double total = 0;

		System.out.println("\nBilling for " + customer.name);

		for (String itemName : customer.items) {
			Item item = itemMap.get(itemName);

			if (item != null && item.stock > 0) {
				total += item.price;
				item.stock--;
				System.out.println(itemName + " - ₹" + item.price);
			} else {
				System.out.println(itemName + " - Out of stock");
			}
		}

		System.out.println("Total Bill: ₹" + total);
	}

	// Display stock
	public void displayStock() {
		System.out.println("\nCurrent Stock:");
		for (String name : itemMap.keySet()) {
			Item i = itemMap.get(name);
			System.out.println(name + " | Price: ₹" + i.price + " | Stock: " + i.stock);
		}
	}
}
