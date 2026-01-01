package com.oopspillars.bankingsystem;

//Savings account with interest and loan facility
class SavingsAccount extends BankAccount implements Loanable {

	private double interestRate;

	public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
		super(accountNumber, holderName, balance);
		this.interestRate = interestRate;
	}

	// Interest calculation for savings account
	@Override
	public double calculateInterest() {
		return balance * interestRate / 100;
	}

	// Loan-related methods
	@Override
	public void applyForLoan(double amount) {
		System.out.println("Loan application submitted for ₹" + amount);
	}

	@Override
	public double calculateLoanEligibility() {
		return balance * 3; // eligible up to 3x balance
	}
}
