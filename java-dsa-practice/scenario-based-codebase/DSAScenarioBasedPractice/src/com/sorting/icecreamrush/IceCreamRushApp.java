package com.sorting.icecreamrush;

public class IceCreamRushApp {

	public static void main(String[] args) {

		Flavor[] flavors = {
				new Flavor("Vanilla", 120),
				new Flavor("Chocolate", 200),
				new Flavor("Strawberry", 90),
				new Flavor("Mango", 150),
				new Flavor("Butterscotch", 110),
				new Flavor("Black Currant", 70),
				new Flavor("Pistachio", 95),
				new Flavor("Coffee", 130)
		};

		IceCreamSorter sorter = new IceCreamSorter();

		System.out.println("Before Sorting:");
		sorter.display(flavors);

		sorter.bubbleSort(flavors);

		System.out.println("\nAfter Sorting by Popularity:");
		sorter.display(flavors);
	}
}
