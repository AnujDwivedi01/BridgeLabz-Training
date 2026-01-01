package com.oopspillars.onlinefooddeliverysystem;

//Non-veg food item with extra charge and discount
class NonVegItem extends FoodItem implements Discountable {

	private static final double EXTRA_CHARGE = 50; // per item

	public NonVegItem(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}

	// Total price calculation with extra charge
	@Override
	public double calculateTotalPrice() {
		double baseTotal = (getPrice() * getQuantity()) + (EXTRA_CHARGE * getQuantity());
		return baseTotal - applyDiscount();
	}

	// 5% discount on non-veg items
	@Override
	public double applyDiscount() {
		return (getPrice() * getQuantity()) * 0.05;
	}

	@Override
	public String getDiscountDetails() {
		return "Non-Veg Item Discount: 5% (Extra charge applied)";
	}
}
