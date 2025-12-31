package com.inheritance.assistedproblems.vehicle;

class Vehicle{
	
	//instance variable
	protected int maxSpeed;
	protected String fuelType;
	
	//constructor
	public Vehicle(int maxSpeed,String fuelType) {
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
		
	}
	
	
	void displayInfo() {
		System.out.println("");
	}
	
	
	
}
