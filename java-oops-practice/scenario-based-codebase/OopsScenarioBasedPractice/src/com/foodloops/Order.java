package com.foodloops;

import java.util.List;

public class Order implements IOrderable {

	private List<FoodItem> items;
	private double totalAmount;

	public Order(List<FoodItem> items) {
		this.items = items;
	}

	public double calculateTotal() {
		double sum = 0;
		for (FoodItem item : items) {
			if (item.isAvailable()) {
				sum += item.getPrice();
			}
		}
		return sum;
	}

	public double applyDiscount() {
		double discount = 0;
		double total = calculateTotal();

		for (FoodItem item : items) {
			discount += item.applyDiscount(total);
		}
		return discount;
	}

	@Override
	public void placeOrder() {
		double total = calculateTotal();
		double discount = applyDiscount();
		totalAmount = total - discount;

		System.out.println("Order Placed Successfully");
		System.out.println("Total Price: " + total);
		System.out.println("Discount: " + discount);
		System.out.println("Final Amount: 	" + totalAmount);
	}

	@Override
	public void cancelOrder() {
		System.out.println("Order Cancelled");
	}
}
