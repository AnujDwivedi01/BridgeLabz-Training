package com.mybankapp;

import java.util.Scanner;

public class MyBankApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = null;

		System.out.println("=== Welcome to MyBank ===");

		// Account creation
		System.out.println("Select Account Type:");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Account Number: ");
		String accNo = sc.nextLine();

		System.out.print("Do you want to enter opening balance? (yes/no): ");
		String option = sc.nextLine();

		double openingBalance = 0;
		if (option.equalsIgnoreCase("yes")) {
			System.out.print("Enter Opening Balance: ");
			openingBalance = sc.nextDouble();
		}

		// Polymorphism
		if (choice == 1) {
			account = option.equalsIgnoreCase("yes") ? new SavingsAccount(accNo, openingBalance)
					: new SavingsAccount(accNo);
		} else if (choice == 2) {
			account = option.equalsIgnoreCase("yes") ? new CurrentAccount(accNo, openingBalance)
					: new CurrentAccount(accNo);
		} else {
			System.out.println("Invalid account type.");
			sc.close();
			return;
		}

		int menuChoice;
		do {
			System.out.println("\n--- MyBank Menu ---");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Calculate Interest");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			menuChoice = sc.nextInt();

			switch (menuChoice) {
			case 1:
				System.out.print("Enter amount to deposit: ");
				account.deposit(sc.nextDouble());
				break;

			case 2:
				System.out.print("Enter amount to withdraw: ");
				account.withdraw(sc.nextDouble());
				break;

			case 3:
				account.checkBalance();
				break;

			case 4:
				account.calculateInterest();
				break;

			case 5:
				System.out.println("Thank you for banking with MyBank!");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (menuChoice != 5);

		sc.close();
	}
}
