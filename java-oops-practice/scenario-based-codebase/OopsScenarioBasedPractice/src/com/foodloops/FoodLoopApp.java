package com.foodloops;

import java.util.ArrayList;
import java.util.List;

public class FoodLoopApp {

	public static void main(String[] args) {

		FoodItem item1 = new VegItem("Paneer Butter Masala", 250, 5);
		FoodItem item2 = new VegItem("Veg Biryani", 200, 3);
		FoodItem item3 = new NonVegItem("Chicken Biryani", 350, 4);

		List<FoodItem> comboMeal = new ArrayList<>();
		comboMeal.add(item1);
		comboMeal.add(item2);
		comboMeal.add(item3);

		Order order = new Order(comboMeal);

		order.placeOrder();
		order.cancelOrder();
	}
}
