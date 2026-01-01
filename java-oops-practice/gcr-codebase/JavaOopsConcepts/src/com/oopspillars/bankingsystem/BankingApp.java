package com.oopspillars.bankingsystem;

//Main class
public class BankingApp {

	public static void main(String[] args) {

		//  BankAccount reference
		BankAccount acc1 = new SavingsAccount("SA101", "Anuj", 50000, 4.5);
		BankAccount acc2 = new CurrentAccount("CA202", "Rahul", 80000);

		// Store different account types together
		BankAccount[] accounts = { acc1, acc2 };

		for (BankAccount acc : accounts) {

			System.out.println("Account Holder : " + acc.getHolderName());
			System.out.println("Account Number : " + acc.getAccountNumber());

			acc.deposit(5000);
			acc.withdraw(2000);

			// Polymorphic interest calculation
			System.out.println("Interest Earned: ₹" + acc.calculateInterest());

			// Loan processing using interface
			if (acc instanceof Loanable) {
				Loanable loan = (Loanable) acc;
				loan.applyForLoan(100000);
				System.out.println("Loan Eligibility: ₹" + loan.calculateLoanEligibility());
			}

			System.out.println("--------------------------------");
		}
	}
}
