package com.oopspillars.onlinefooddeliverysystem;

//Utility class to process orders polymorphically
class OrderProcessor {

	// Method using FoodItem reference (Polymorphism)
	public static void processOrder(FoodItem[] items) {

		double grandTotal = 0;

		for (FoodItem item : items) {

			item.getItemDetails();

			// Discount details (interface check)
			if (item instanceof Discountable) {
				Discountable d = (Discountable) item;
				System.out.println(d.getDiscountDetails());
			}

			double total = item.calculateTotalPrice();
			System.out.println("Total Price : ₹" + total);
			System.out.println("--------------------------------");

			grandTotal += total;
		}

		System.out.println("Grand Total Amount: ₹" + grandTotal);
	}
}
