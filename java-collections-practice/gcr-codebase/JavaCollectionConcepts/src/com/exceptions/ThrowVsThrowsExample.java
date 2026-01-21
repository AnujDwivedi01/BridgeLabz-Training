package com.exceptions;

public class ThrowVsThrowsExample {

	// Method that propagates exception
	static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {

		if (amount < 0 || rate < 0) {
			// throw keyword used to create and send exception
			throw new IllegalArgumentException("Negative values not allowed");
		}

		// Simple Interest Formula
		return (amount * rate * years) / 100;
	}

	public static void main(String[] args) {

		try {
			double interest = calculateInterest(10000, 5, 2);
			System.out.println("Calculated Interest: " + interest);

		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input: Amount and rate must be positive");
		}
	}
}
