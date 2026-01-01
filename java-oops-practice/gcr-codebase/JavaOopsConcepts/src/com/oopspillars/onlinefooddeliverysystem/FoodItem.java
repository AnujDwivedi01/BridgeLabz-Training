package com.oopspillars.onlinefooddeliverysystem;

//Abstract class representing a generic food item
abstract class FoodItem {

	// Encapsulated fields (secured order details)
	private String itemName;
	private double price;
	private int quantity;

	// Constructor to initialize food item
	public FoodItem(String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	// Getter methods (controlled access)
	public String getItemName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	// Concrete method to display item details
	public void getItemDetails() {
		System.out.println("Item Name : " + itemName);
		System.out.println("Price     : ₹" + price);
		System.out.println("Quantity  : " + quantity);
	}

	// Abstract method to calculate total price
	public abstract double calculateTotalPrice();
}
