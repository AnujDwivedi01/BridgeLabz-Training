package com.budgetwise;

import java.util.*;

public abstract class Budget implements IAnalyzable {

	protected double income;
	protected double limit;
	protected Map<String, Double> categoryLimits;
	protected List<Transaction> transactions;

	public Budget(double income, double limit, Map<String, Double> categoryLimits) {
		this.income = income;
		this.limit = limit;
		this.categoryLimits = categoryLimits;
		this.transactions = new ArrayList<>();
	}

	public void addTransaction(Transaction t) {
		transactions.add(t);
	}

	protected double totalExpenses() {
		double sum = 0;
		for (Transaction t : transactions) {
			if (t.getType().equals("EXPENSE")) {
				sum += t.getAmount();
			}
		}
		return sum;
	}

	public double netSavings() {
		return income - totalExpenses();
	}

}
