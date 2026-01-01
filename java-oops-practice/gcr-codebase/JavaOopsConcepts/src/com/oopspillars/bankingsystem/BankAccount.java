package com.oopspillars.bankingsystem;

//Abstract class representing a generic bank account
abstract class BankAccount {

	// Encapsulated fields (secured data)
	private String accountNumber;
	private String holderName;
	protected double balance; // protected so subclasses can access

	// Constructor to initialize account details
	public BankAccount(String accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	// Getter methods (controlled access)
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public double getBalance() {
		return balance;
	}

	// Concrete method: deposit money
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited ₹" + amount + " | Balance: ₹" + balance);
	}

	// Concrete method: withdraw money
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn ₹" + amount + " | Balance: ₹" + balance);
		} else {
			System.out.println("Insufficient balance");
		}
	}

	// Abstract method to calculate interest
	public abstract double calculateInterest();
}
