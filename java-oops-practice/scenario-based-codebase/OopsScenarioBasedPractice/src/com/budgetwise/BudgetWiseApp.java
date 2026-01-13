package com.budgetwise;

import java.util.*;

public class BudgetWiseApp {

	public static void main(String[] args) {

		Map<String, Double> categories = new HashMap<>();
		categories.put("Food", 5000.0);
		categories.put("Travel", 3000.0);
		categories.put("Shopping", 2000.0);

		Budget monthly = new MonthlyBudget(30000, 25000, categories);

		monthly.addTransaction(new Transaction(4000, "EXPENSE", "Food"));
		monthly.addTransaction(new Transaction(3500, "EXPENSE", "Travel"));
		monthly.addTransaction(new Transaction(2000, "EXPENSE", "Shopping"));

		monthly.generateReport();
		monthly.detectOverspend();

		System.out.println();

		Budget annual = new AnnualBudget(360000, 300000, categories);
		annual.addTransaction(new Transaction(280000, "EXPENSE", "General"));

		annual.generateReport();
		annual.detectOverspend();
	}
}
