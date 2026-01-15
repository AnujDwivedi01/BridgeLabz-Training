package com.sorting.smartshelf;

import java.util.Scanner;

public class LibrarayApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of books");
		int n = input.nextInt();
		input.nextLine();

		Book[] shelf = new Book[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Enter Book Title : ");
			String title = input.nextLine();

			shelf[count++] = new Book(title);

			// sorting after each insertion
			SmartShelf.insertionSort(shelf, count);
			SmartShelf.display(shelf, count);
		}

		input.close();
	}

}
