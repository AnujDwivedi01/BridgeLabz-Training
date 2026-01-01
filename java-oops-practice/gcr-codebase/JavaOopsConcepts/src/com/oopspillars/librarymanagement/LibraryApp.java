package com.oopspillars.librarymanagement;

//Main class
public class LibraryApp {

	public static void main(String[] args) {

		//  LibraryItem reference
		LibraryItem[] items = { new Book(1, "Java Programming", "James Gosling"),
				new Magazine(2, "Tech Monthly", "Editorial Team"), new DVD(3, "Inception", "Christopher Nolan") };

		// Process all items using base class reference
		for (LibraryItem item : items) {

			item.getItemDetails();
			System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

			// Reserve item
			if (item.checkAvailability()) {
				item.reserveItem("Anuj");
			}

			System.out.println("--------------------------------");
		}
	}
}
