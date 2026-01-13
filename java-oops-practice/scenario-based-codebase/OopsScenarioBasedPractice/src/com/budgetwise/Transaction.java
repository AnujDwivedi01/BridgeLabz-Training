package com.budgetwise;

import java.time.LocalDate;

public class Transaction {
	private String type;
	private double amount;
	private String category;
	private LocalDate date;

	public Transaction(double amount, String type, String category) {
		this.type = type;
		this.amount = amount;
		this.category = category;
		this.date = LocalDate.now();
	}

	public double getAmount() {
		return amount;
	}

	public String getType() {
		return type;
	}

	public String getCategory() {
		return category;
	}

}
