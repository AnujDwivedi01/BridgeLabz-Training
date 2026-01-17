package com.sorting.icecreamrush;

public class Flavor {

	private String name;
	private int soldCount;

	public Flavor(String name, int soldCount) {
		this.name = name;
		this.soldCount = soldCount;
	}

	public String getName() {
		return name;
	}

	public int getSoldCount() {
		return soldCount;
	}

	@Override
	public String toString() {
		return name + " (Sold: " + soldCount + ")";
	}
}
