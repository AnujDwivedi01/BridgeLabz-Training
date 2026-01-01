package com.oopspillars.librarymanagement;

//Abstract class representing a generic library item
abstract class LibraryItem implements Reservable {

	// Encapsulated fields (secured data)
	private int itemId;
	private String title;
	private String author;

	// Borrower details kept private (encapsulation)
	private String borrowerName;
	private boolean available = true;

	// Constructor to initialize item details
	public LibraryItem(int itemId, String title, String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}

	// Getter methods (controlled access)
	public int getItemId() {
		return itemId;
	}

	public String getTitle() {
		return title;
	}

	// Concrete method to display common item details
	public void getItemDetails() {
		System.out.println("Item ID   : " + itemId);
		System.out.println("Title     : " + title);
		System.out.println("Author    : " + author);
		System.out.println("Available : " + (available ? "Yes" : "No"));
	}

	// Reservation logic (interface implementation)
	@Override
	public void reserveItem(String borrowerName) {
		if (available) {
			this.borrowerName = borrowerName;
			this.available = false;
			System.out.println("Item reserved by: " + borrowerName);
		} else {
			System.out.println("Item is already reserved.");
		}
	}

	@Override
	public boolean checkAvailability() {
		return available;
	}

	// Abstract method to be implemented by subclasses
	public abstract int getLoanDuration();
}
