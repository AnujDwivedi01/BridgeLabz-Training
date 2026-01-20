package com.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

	public static void generateBinary(int n) {

		Queue<String> queue = new LinkedList<>();

		// Step 1: start with "1"
		queue.add("1");

		for (int i = 1; i <= n; i++) {

			// Step 2: remove front
			String current = queue.remove();

			// Step 3: print result
			System.out.print(current + " ");

			// Step 4: generate next binaries
			queue.add(current + "0");
			queue.add(current + "1");
		}
	}

	public static void main(String[] args) {

		int N = 5;
		generateBinary(N);
	}
}
