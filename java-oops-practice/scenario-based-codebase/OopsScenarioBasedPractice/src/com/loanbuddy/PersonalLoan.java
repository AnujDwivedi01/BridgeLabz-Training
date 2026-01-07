package com.loanbuddy;

// Personal Loan
class PersonalLoan extends LoanApplication {

	public PersonalLoan(Applicant applicant, int term) {
		super(applicant, term, 14.0);
	}

	@Override
	public boolean approveLoan() {
		boolean approved = applicant.getCreditScore() >= 650 && applicant.getIncome() >= 25000;

		setLoanStatus(approved);
		return approved;
	}

	@Override
	public double calculateEMI() {
		return emiFormula(applicant.getLoanAmount(), interestRate, term);
	}
}
