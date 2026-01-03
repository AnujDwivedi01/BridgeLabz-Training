package com.mybankapp;

interface ITransaction {
	void deposit(double amount);

	void withdraw(double amount);

	void checkBalance();

	void calculateInterest();
}
