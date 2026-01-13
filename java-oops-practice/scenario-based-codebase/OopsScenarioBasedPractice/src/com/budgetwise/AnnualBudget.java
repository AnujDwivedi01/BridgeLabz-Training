package com.budgetwise;

import java.util.Map;

class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit, Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("Annual Budget Summary");
        System.out.println("Total Income: " + income);
        System.out.println("Total Expenses: " + totalExpenses());
        System.out.println("Yearly Savings: " + netSavings());
    }

    @Override
    public void detectOverspend() {
        System.out.println("Annual Overspend Analysis");
        if (totalExpenses() > limit) {
            System.out.println("Overall yearly budget exceeded!");
        }
    }
}
