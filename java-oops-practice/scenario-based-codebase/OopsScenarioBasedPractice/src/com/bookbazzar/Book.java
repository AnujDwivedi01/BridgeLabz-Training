package com.bookbazzar;

// Base Book class
abstract class Book implements IDiscountable {

	protected String title;
	protected String author;
	protected double price;

	// Stock should not be modified directly
	private int stock;

	// Constructor without offer
	public Book(String title, String author, double price, int stock) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}

	// Encapsulated stock access
	public int getStock() {
		return stock;
	}

	// Controlled stock update
	public void reduceStock(int quantity) {
		if (quantity <= stock) {
			stock -= quantity;
		} else {
			throw new RuntimeException("Insufficient stock for " + title);
		}
	}

	// Common book details
	public void displayBook() {
		System.out.println(title + " by " + author + " | Price: ₹" + price + " | Stock: " + stock);
	}
}
