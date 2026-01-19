package com.listinterface;

import java.util.*;

public class NthFromEnd {

	public static <T> T findNthFromEnd(LinkedList<T> list, int n) {

		if (list == null || n <= 0) {
			throw new IllegalArgumentException("Invalid input");
		}

		Iterator<T> fast = list.iterator();
		Iterator<T> slow = list.iterator();

		// Move fast pointer n steps ahead
		for (int i = 0; i < n; i++) {
			if (!fast.hasNext()) {
				throw new IllegalArgumentException("N is greater than list size");
			}
			fast.next();
		}

		// Move both pointers until fast reaches end
		while (fast.hasNext()) {
			fast.next();
			slow.next();
		}

		// slow now points to Nth element from end
		return slow.next();
	}

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));

		int n = 2;

		System.out.println("Nth element from end: " + findNthFromEnd(list, n));
	}
}
