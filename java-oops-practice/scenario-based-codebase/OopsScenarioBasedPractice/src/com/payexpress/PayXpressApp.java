package com.payexpress;

import java.time.LocalDate;

public class PayXpressApp {

	public static void main(String[] args) {

		Bill electricity = new ElectricityBill(1200, LocalDate.now().plusDays(5));
		Bill internet = new InternetBill(800, LocalDate.now().plusDays(3));
		Bill water = new WaterBill(400, LocalDate.now().plusDays(7));

		electricity.sendReminder();
		System.out.println("Payable Amount: ₹" + electricity.calculatePayableAmount(false));
		electricity.pay();

		System.out.println();

		internet.sendReminder();
		System.out.println("Late Payable Amount: ₹" + internet.calculatePayableAmount(true));
		internet.pay();

		System.out.println();

		water.sendReminder();
		water.pay();
	}
}
