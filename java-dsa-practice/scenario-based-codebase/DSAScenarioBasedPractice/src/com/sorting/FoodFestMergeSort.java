package com.sorting;

import java.util.*;

public class FoodFestMergeSort {

	// Stall model
	static class Stall {
		String name;
		String zone;
		int footfall;

		Stall(String name, String zone, int footfall) {
			this.name = name;
			this.zone = zone;
			this.footfall = footfall;
		}

		@Override
		public String toString() {
			return name + " (" + zone + ") -> " + footfall;
		}
	}

	// Merge Sort
	public static List<Stall> mergeSort(List<Stall> list) {
		if (list.size() <= 1)
			return list;

		int mid = list.size() / 2;

		List<Stall> left = mergeSort(new ArrayList<>(list.subList(0, mid)));
		List<Stall> right = mergeSort(new ArrayList<>(list.subList(mid, list.size())));

		return merge(left, right);
	}

	// Stable Merge
	private static List<Stall> merge(List<Stall> left, List<Stall> right) {
		List<Stall> result = new ArrayList<>();
		int i = 0, j = 0;

		while (i < left.size() && j < right.size()) {
			// <= maintains stability
			if (left.get(i).footfall <= right.get(j).footfall) {
				result.add(left.get(i++));
			} else {
				result.add(right.get(j++));
			}
		}

		while (i < left.size())
			result.add(left.get(i++));
		while (j < right.size())
			result.add(right.get(j++));

		return result;
	}

	// Display stalls
	private static void display(List<Stall> stalls) {
		if (stalls.isEmpty()) {
			System.out.println("No stall data available.");
			return;
		}
		for (Stall s : stalls) {
			System.out.println(s);
		}
	}

	// Main with user input and switch
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Stall> stalls = new ArrayList<>();
		int choice;

		do {
			System.out.println("\n===== FoodFest Menu =====");
			System.out.println("1. Add Stall Footfall");
			System.out.println("2. Display All Stalls");
			System.out.println("3. Sort Stalls by Footfall (Merge Sort)");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {

			case 1:
				System.out.print("Enter Stall Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Zone: ");
				String zone = sc.nextLine();

				System.out.print("Enter Footfall: ");
				int footfall = sc.nextInt();

				stalls.add(new Stall(name, zone, footfall));
				System.out.println("Stall added successfully.");
				break;

			case 2:
				System.out.println("\n--- Stall Data ---");
				display(stalls);
				break;

			case 3:
				stalls = mergeSort(stalls);
				System.out.println("\nStalls sorted by footfall (ascending):");
				display(stalls);
				break;

			case 4:
				System.out.println("Exiting FoodFest system.");
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}

		} while (choice != 4);

		sc.close();
	}
}
