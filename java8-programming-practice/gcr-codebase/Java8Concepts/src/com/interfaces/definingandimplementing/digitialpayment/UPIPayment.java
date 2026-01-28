package com.interfaces.definingandimplementing.digitialpayment;

public class UPIPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using UPI");
	}
}
