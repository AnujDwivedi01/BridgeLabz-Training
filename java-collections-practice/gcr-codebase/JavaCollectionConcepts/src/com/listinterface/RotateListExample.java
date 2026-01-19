package com.listinterface;

import java.util.*;

public class RotateListExample {

	public static void rotateLeft(List<Integer> list, int k) {
		int n = list.size();

		// Handle cases where k > size
		k = k % n;

		List<Integer> rotated = new ArrayList<>();

		// Add elements from k to end
		for (int i = k; i < n; i++) {
			rotated.add(list.get(i));
		}

		// Add first k elements
		for (int i = 0; i < k; i++) {
			rotated.add(list.get(i));
		}

		// Copy back to original list
		for (int i = 0; i < n; i++) {
			list.set(i, rotated.get(i));
		}
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

		System.out.println("Original List: " + list);
		rotateLeft(list, 2);
		System.out.println("Rotated List: " + list);
	}
}
