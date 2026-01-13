package com.budgetwise;

import java.util.Map;

public class MonthlyBudget extends Budget {
	public MonthlyBudget(double income, double limit, Map<String, Double> categoryLimits) {
		super(income, limit, categoryLimits);
	}
	
	 @Override
	    public void generateReport() {
	        System.out.println("Monthly Budget Report");
	        System.out.println("Income: " + income);
	        System.out.println("Expenses: " + totalExpenses());
	        System.out.println("Savings: " + netSavings());
	    }
	 
	  @Override
	    public void detectOverspend() {
	        System.out.println("Monthly Overspend Check");
	        for (String category : categoryLimits.keySet()) {
	            double spent = transactions.stream()
	                    .filter(t -> t.getCategory().equals(category) && t.getType().equals("EXPENSE"))
	                    .mapToDouble(Transaction::getAmount)
	                    .sum();

	            if (spent > categoryLimits.get(category)) {
	                System.out.println("Overspent in " + category);
	            }
	        }
	    }

}
