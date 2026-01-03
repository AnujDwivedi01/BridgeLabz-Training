package com.mybankapp;

abstract class Account implements ITransaction {
	protected String accountNumber;
	private double balance;

	// Constructor with opening balance
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// Constructor without opening balance
	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	// Deposit
	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Amount deposited successfully.");
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	// Withdraw
	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Amount withdrawn successfully.");
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}

	// Check balance
	@Override
	public void checkBalance() {
		System.out.println("Current Balance: " + balance);
	}

	// Getter for balance 
	protected double getBalance() {
		return balance;
	}

	// Setter for balance 
	protected void setBalance(double balance) {
		this.balance = balance;
	}

	// Abstract method for interest 
	public abstract void calculateInterest();
}
