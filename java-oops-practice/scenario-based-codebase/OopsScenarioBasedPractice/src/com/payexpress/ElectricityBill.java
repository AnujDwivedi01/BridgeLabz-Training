package com.payexpress;

import java.time.LocalDate;

class ElectricityBill extends Bill {

	public ElectricityBill(double amount, LocalDate dueDate) {
		super("Electricity", amount, dueDate, 100);
	}

	@Override
	public void pay() {
		markPaid();
		System.out.println("Electricity bill paid successfully.");
	}

	@Override
	public void sendReminder() {
		System.out.println("Reminder: Pay your electricity bill before power disconnection.");
	}
}
