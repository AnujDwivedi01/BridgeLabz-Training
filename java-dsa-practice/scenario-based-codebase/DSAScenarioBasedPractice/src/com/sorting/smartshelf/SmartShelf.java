package com.sorting.smartshelf;

public class SmartShelf {
	public static void insertionSort(Book[] books, int n) {
		for (int i = 1; i < n; i++) {

			Book key = books[i];
			int j = i - 1;

			while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {

				books[j + 1] = books[j];
				j--;

			}

			books[j + 1] = key;

		}
	}

	   public static void display(Book[] books, int n) {
		System.out.println("\nCurrent Sorted Reading List:");
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + ". " + books[i].title);
		}
	   }
}
