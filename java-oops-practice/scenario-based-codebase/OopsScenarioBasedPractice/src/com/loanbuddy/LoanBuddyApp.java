package com.loanbuddy;

public class LoanBuddyApp {

	public static void main(String[] args) {

		Applicant a1 = new Applicant("Anuj", 720, 50000, 500000);
		Applicant a2 = new Applicant("Rahul", 640, 28000, 300000);

		// Polymorphism: base class reference
		LoanApplication loan1 = new HomeLoan(a1, 240);
		LoanApplication loan2 = new PersonalLoan(a2, 60);

		processLoan(loan1);
		processLoan(loan2);
	}

	// Generic loan processor
	public static void processLoan(LoanApplication loan) {

		System.out.println("\nApplicant: " + loan.applicant.getName());

		if (loan.approveLoan()) {
			System.out.println("Loan Status : " + loan.getLoanStatus());
			System.out.println("Monthly EMI : ₹" + String.format("%.2f", loan.calculateEMI()));
		} else {
			System.out.println("Loan Status : " + loan.getLoanStatus());
		}
	}
}
