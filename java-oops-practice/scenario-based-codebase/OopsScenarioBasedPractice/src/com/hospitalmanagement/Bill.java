package com.hospitalmanagement;

public class Bill implements Payable {
	// instance variable

	private double baseAmmount;
	private double tax;
	private double discount;

	// constructor for base ammount
	public Bill(double baseAmmount) {
		this.baseAmmount = baseAmmount;
	}

	@Override
	public void calculatePayment() {
		tax = baseAmmount * 0.05; // for tax
		discount = baseAmmount > 5000 ? baseAmmount * 0.10 : 0;// for discount
		double totalBill = baseAmmount + tax - discount;

		System.out.println("Base Ammount       : " + this.baseAmmount);
		System.out.println("tax Ammount        : " + this.tax);
		System.out.println("discounted Ammount : " + this.discount);
		System.out.println("Total Ammount      : " + totalBill);
		System.out.println("------------------------------------------");

	}

}
