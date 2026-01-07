package com.loanbuddy;
// Auto Loan
class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 10.0);
    }

    @Override
    public boolean approveLoan() {
        boolean approved =
                applicant.getCreditScore() >= 600 &&
                applicant.getIncome() >= 30000;

        setLoanStatus(approved);
        return approved;
    }

    @Override
    public double calculateEMI() {
        // Auto loan has processing surcharge
        double emi = emiFormula(applicant.getLoanAmount(), interestRate, term);
        return emi + 300;
    }
}
