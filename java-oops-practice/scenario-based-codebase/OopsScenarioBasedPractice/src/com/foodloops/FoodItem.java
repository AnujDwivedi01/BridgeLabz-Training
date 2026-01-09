package com.foodloops;

public class FoodItem {
	protected String name;
	protected String category;
	protected double price;
	protected boolean available;

	private int stock; // hidden 

	public FoodItem(String name, String category, double price, int stock) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
		this.available = stock > 0;
	}

	public double getPrice() {
		return price;
	}

	public boolean isAvailable() {
		return available;
	}

	protected void updateStock() {
		if (stock > 0) {
			stock--;
		}
		available = stock > 0;
	}

	// Polymorphic method
	public double applyDiscount(double total) {
		return 0; // default no discount
	}
}
