package com.payexpress;

import java.time.LocalDate;

abstract class Bill implements IPayable {

	protected String type;
	protected double amount;
	protected LocalDate dueDate;
	private boolean isPaid; // encapsulated
	protected double penalty;

	// Constructor for recurring bills
	public Bill(String type, double amount, LocalDate dueDate, double penalty) {
		this.type = type;
		this.amount = amount;
		this.dueDate = dueDate;
		this.penalty = penalty;
		this.isPaid = false;
	}

	// Operator usage (late fee calculation)
	public double calculatePayableAmount(boolean isLate) {
		return isLate ? amount + penalty : amount;
	}

	protected void markPaid() {
		isPaid = true;
	}

	public boolean checkStatus() {
		return isPaid;
	}
}
