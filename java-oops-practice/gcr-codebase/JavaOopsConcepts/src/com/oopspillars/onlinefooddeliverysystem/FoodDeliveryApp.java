package com.oopspillars.onlinefooddeliverysystem;

//Main class
public class FoodDeliveryApp {

	public static void main(String[] args) {

		// Polymorphism: FoodItem reference
		FoodItem[] orderItems = { new VegItem("Paneer Burger", 150, 2), new NonVegItem("Chicken Pizza", 300, 1),
				new VegItem("French Fries", 100, 3) };

		// Process complete order
		OrderProcessor.processOrder(orderItems);
	}
}
