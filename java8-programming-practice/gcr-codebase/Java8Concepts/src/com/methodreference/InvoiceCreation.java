package com.methodreference;

import java.util.*;

public class InvoiceCreation {

	// Invoice class inside same file
	static class Invoice {
		int transactionId;

		Invoice(int transactionId) {
			this.transactionId = transactionId;
		}

		@Override
		public String toString() {
			return "Invoice generated for Transaction ID: " + transactionId;
		}
	}

	public static void main(String[] args) {

		List<Integer> transactionIds = Arrays.asList(501, 502, 503);

		// Constructor reference
		List<Invoice> invoices = transactionIds.stream().map(Invoice::new).toList();

		invoices.forEach(System.out::println);
	}
}
