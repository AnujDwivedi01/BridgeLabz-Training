package com.oopspillars.bankingsystem;

//Current account with lower interest and loan facility
class CurrentAccount extends BankAccount implements Loanable {

	public CurrentAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	// Interest calculation for current account (low / zero)
	@Override
	public double calculateInterest() {
		return balance * 0.02; // 2% interest
	}

	// Loan-related methods
	@Override
	public void applyForLoan(double amount) {
		System.out.println("Current account loan request: ₹" + amount);
	}

	@Override
	public double calculateLoanEligibility() {
		return balance * 2; // eligible up to 2x balance
	}
}
