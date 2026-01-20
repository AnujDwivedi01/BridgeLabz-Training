package com.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieTime {
	public static void insertionSort(List<Integer> showTimes) {
		for (int i = 1; i < showTimes.size(); i++) {
			int key = showTimes.get(i);
			int j = i - 1;

			// Shift elements greater than key to the right
			while (j >= 0 && showTimes.get(j) > key) {
				showTimes.set(j + 1, showTimes.get(j));
				j--;
			}

			// Insert key at correct position
			showTimes.set(j + 1, key);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> showTimes = new ArrayList<>();

		int choice;

		do {
			System.out.println("\n--- MovieTime Show Listing ---");
			System.out.println("1. Add Show Time");
			System.out.println("2. View Sorted Show Times");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter show time (in minutes): ");
				int time = sc.nextInt();
				showTimes.add(time);

				// Real-time insertion sort
				insertionSort(showTimes);

				System.out.println("Show time added and sorted.");
				break;

			case 2:
				if (showTimes.isEmpty()) {
					System.out.println("No showtimes available.");
				} else {
					System.out.println("Sorted Showtimes:");
					for (int t : showTimes) {
						System.out.println(t + " minutes");
					}
				}
				break;

			case 3:
				System.out.println("Exiting MovieTime...");
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}

		} while (choice != 3);

		sc.close();
	}
}