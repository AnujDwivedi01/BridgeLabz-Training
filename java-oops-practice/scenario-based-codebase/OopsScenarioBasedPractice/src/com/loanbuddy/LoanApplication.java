package com.loanbuddy;

abstract class LoanApplication implements IApprovable {

	protected Applicant applicant;
	protected int term; // in months
	protected double interestRate; // annual %

	// Loan status cannot be changed externally
	private String loanStatus = "PENDING";

	public LoanApplication(Applicant applicant, int term, double interestRate) {
		this.applicant = applicant;
		this.term = term;
		this.interestRate = interestRate;
	}

	// EMI formula: P × R × (1+R)^N / ((1+R)^N – 1)
	protected double emiFormula(double principal, double rate, int months) {
		double monthlyRate = rate / (12 * 100);
		return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
	}

	// Internal approval decision
	protected void setLoanStatus(boolean approved) {
		loanStatus = approved ? "APPROVED" : "REJECTED";
	}

	public String getLoanStatus() {
		return loanStatus;
	}
}