package com.sorting.icecreamrush;

public class IceCreamSorter {

	// Bubble Sort by popularity (descending)
	public void bubbleSort(Flavor[] flavors) {

		int n = flavors.length;
		int counter = 1;
		while (counter <= n) {
			boolean swapped = false;
			for (int i = 0; i < n - counter; i++) {
				if (flavors[i].getSoldCount() < flavors[i + 1].getSoldCount()) {
					swapped = true;
					Flavor temp = flavors[i];
					flavors[i] = flavors[i + 1];
					flavors[i + 1] = temp;
				}
			}
			if (!swapped) {
				break;
			}
		}

	}

	public void display(Flavor[] flavors) {
		for (Flavor f : flavors) {
			System.out.println(f);
		}
	}
}
