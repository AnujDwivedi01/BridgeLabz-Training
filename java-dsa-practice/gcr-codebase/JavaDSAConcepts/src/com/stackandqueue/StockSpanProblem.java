package com.stackandqueue;

import java.util.Stack;

public class StockSpanProblem {

	public static void calculateSpan(int[] prices) {

		int n = prices.length;
		int[] span = new int[n];
		Stack<Integer> stack = new Stack<>();

		// First day span is always 1
		span[0] = 1;
		stack.push(0);

		// Calculate span for remaining days
		for (int i = 1; i < n; i++) {

			// Pop while current price is higher
			while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
				stack.pop();
			}

			// If stack empty, price is greater than all previous prices
			span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

			// Push current index
			stack.push(i);
		}

		// Display result
		System.out.println("Stock Prices:");
		for (int price : prices) {
			System.out.print(price + " ");
		}

		System.out.println("\nStock Spans:");
		for (int s : span) {
			System.out.print(s + " ");
		}
	}

	public static void main(String[] args) {

		int[] prices = { 100, 80, 60, 70, 60, 75, 85 };
		calculateSpan(prices);
	}
}
