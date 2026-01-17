package com.sorting.smartlibrary;

public class SmartLibraryApp {

	public static void main(String[] args) {

		SmartLibraryManager manager = new SmartLibraryManager();

		// fixed-size array for demo
		Book[] borrowedBooks = new Book[10];
		int size = 0;

		// books issued one by one
		borrowedBooks[size++] = new Book("Java Programming");
		manager.insertBook(borrowedBooks, size);

		borrowedBooks[size++] = new Book("Data Structures");
		manager.insertBook(borrowedBooks, size);

		borrowedBooks[size++] = new Book("Algorithms");
		manager.insertBook(borrowedBooks, size);

		borrowedBooks[size++] = new Book("Operating Systems");
		manager.insertBook(borrowedBooks, size);

		System.out.println("Borrowed Books (Alphabetically Sorted):");
		manager.displayBooks(borrowedBooks, size);
	}
}
