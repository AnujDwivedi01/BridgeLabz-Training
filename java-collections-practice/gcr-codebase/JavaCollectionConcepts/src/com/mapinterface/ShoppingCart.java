package com.mapinterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {

	// Product price list
	private HashMap<String, Integer> productPrices = new HashMap<>();

	// Cart items in insertion order
	private LinkedHashMap<String, Integer> cartItems = new LinkedHashMap<>();

	public ShoppingCart() {
		// Initialize products
		productPrices.put("Apple", 50);
		productPrices.put("Banana", 20);
		productPrices.put("Milk", 40);
		productPrices.put("Bread", 30);
	}

	// Add item to cart
	public void addToCart(String product) {

		if (!productPrices.containsKey(product)) {
			System.out.println("Product not available: " + product);
			return;
		}

		cartItems.put(product, productPrices.get(product));
		System.out.println(product + " added to cart");
	}

	// Display cart in insertion order
	public void displayCart() {

		System.out.println("\nCart Items (Insertion Order):");
		for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
			System.out.println(entry.getKey() + " : ₹" + entry.getValue());
		}
	}

	// Display cart sorted by price
	public void displayCartSortedByPrice() {

		// TreeMap sorts by key, so price is used as key
		TreeMap<Integer, String> sortedByPrice = new TreeMap<>();

		for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
			sortedByPrice.put(entry.getValue(), entry.getKey());
		}

		System.out.println("\nCart Items (Sorted by Price):");
		for (Map.Entry<Integer, String> entry : sortedByPrice.entrySet()) {
			System.out.println(entry.getValue() + " : ₹" + entry.getKey());
		}
	}

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();

		cart.addToCart("Milk");
		cart.addToCart("Apple");
		cart.addToCart("Bread");
		cart.addToCart("Banana");

		cart.displayCart();
		cart.displayCartSortedByPrice();
	}
}
