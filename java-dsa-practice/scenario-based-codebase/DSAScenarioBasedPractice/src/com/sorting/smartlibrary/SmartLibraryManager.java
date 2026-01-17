package com.sorting.smartlibrary;

public class SmartLibraryManager {

	// insert book into sorted list using insertion sort
	public void insertBook(Book[] books, int size) {

		Book key = books[size - 1];
		int j = size - 2;

		// shift books that are alphabetically greater
		while (j >= 0 && books[j].getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
			books[j + 1] = books[j];
			j--;
		}

		// insert book at correct position
		books[j + 1] = key;
	}

	// display borrowed books
	public void displayBooks(Book[] books, int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(books[i]);
		}
	}
}
