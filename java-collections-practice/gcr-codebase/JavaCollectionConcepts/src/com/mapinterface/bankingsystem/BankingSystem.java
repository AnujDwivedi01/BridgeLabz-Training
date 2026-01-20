package com.mapinterface.bankingsystem;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BankingSystem {

	// AccountNumber -> Balance
	private HashMap<Integer, Integer> accounts = new HashMap<>();

	// Withdrawal request queue
	private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

	// Add account
	public void addAccount(int accountNumber, int balance) {
		accounts.put(accountNumber, balance);
	}

	// Add withdrawal request
	public void requestWithdrawal(int accountNumber, int amount) {
		withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
	}

	// Process withdrawals
	public void processWithdrawals() {

		System.out.println("\nProcessing Withdrawals:");

		while (!withdrawalQueue.isEmpty()) {

			WithdrawalRequest req = withdrawalQueue.poll();

			int balance = accounts.getOrDefault(req.accountNumber, -1);

			if (balance == -1) {
				System.out.println("Account not found: " + req.accountNumber);
			} else if (balance < req.amount) {
				System.out.println("Insufficient balance for Account " + req.accountNumber);
			} else {
				accounts.put(req.accountNumber, balance - req.amount);
				System.out.println("Withdrawn ₹" + req.amount + " from Account " + req.accountNumber);
			}
		}
	}

	// Display customers sorted by balance
	public void displayCustomersSortedByBalance() {

		// Balance -> AccountNumber (TreeMap sorts by balance)
		TreeMap<Integer, Integer> sortedByBalance = new TreeMap<>();

		for (Map.Entry<Integer, Integer> entry : accounts.entrySet()) {
			sortedByBalance.put(entry.getValue(), entry.getKey());
		}

		System.out.println("\nCustomers Sorted by Balance:");
		for (Map.Entry<Integer, Integer> entry : sortedByBalance.entrySet()) {
			System.out.println("Account " + entry.getValue() + " : ₹" + entry.getKey());
		}
	}

	public static void main(String[] args) {

		BankingSystem bank = new BankingSystem();

		bank.addAccount(101, 5000);
		bank.addAccount(102, 3000);
		bank.addAccount(103, 7000);

		bank.requestWithdrawal(101, 1000);
		bank.requestWithdrawal(103, 2000);
		bank.requestWithdrawal(102, 4000);

		bank.processWithdrawals();
		bank.displayCustomersSortedByBalance();
	}
}
