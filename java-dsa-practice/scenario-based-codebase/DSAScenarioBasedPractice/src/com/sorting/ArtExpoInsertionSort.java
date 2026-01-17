package com.sorting;

import java.util.Scanner;

public class ArtExpoInsertionSort {

	// Insertion Sort method
	static void insertionSort(int[] time) {
		for (int i = 1; i < time.length; i++) {
			int key = time[i]; // current registration time
			int j = i - 1;

			// Shift elements greater than key
			while (j >= 0 && time[j] > key) {
				time[j + 1] = time[j];
				j--;
			}

			// Place key at correct position
			time[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of artists: ");
		int n = sc.nextInt();

		int[] regTime = new int[n];

		System.out.println("Enter registration times:");
		for (int i = 0; i < n; i++) {
			regTime[i] = sc.nextInt();
		}

		// Sorting using Insertion Sort
		insertionSort(regTime);

		System.out.println("Sorted registration times:");
		for (int t : regTime) {
			System.out.print(t + " ");
		}

		sc.close();
	}
}
