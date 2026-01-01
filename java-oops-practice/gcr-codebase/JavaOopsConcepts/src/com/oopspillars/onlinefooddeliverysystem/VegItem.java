package com.oopspillars.onlinefooddeliverysystem;

//Veg food item with discount
class VegItem extends FoodItem implements Discountable {

	public VegItem(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}

	// Total price calculation (no extra charge)
	@Override
	public double calculateTotalPrice() {
		return getPrice() * getQuantity() - applyDiscount();
	}

	// 10% discount on veg items
	@Override
	public double applyDiscount() {
		return (getPrice() * getQuantity()) * 0.10;
	}

	@Override
	public String getDiscountDetails() {
		return "Veg Item Discount: 10%";
	}
}
