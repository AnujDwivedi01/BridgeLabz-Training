package com.loanbuddy;

// Home Loan
class HomeLoan extends LoanApplication {

	public HomeLoan(Applicant applicant, int term) {
		super(applicant, term, 8.5);
	}

	@Override
	public boolean approveLoan() {
		boolean approved = applicant.getCreditScore() >= 700 && applicant.getIncome() >= 40000;

		setLoanStatus(approved);
		return approved;
	}

	@Override
	public double calculateEMI() {
		// Home loans get lower effective rate
		return emiFormula(applicant.getLoanAmount(), interestRate - 0.5, term);
	}
}
