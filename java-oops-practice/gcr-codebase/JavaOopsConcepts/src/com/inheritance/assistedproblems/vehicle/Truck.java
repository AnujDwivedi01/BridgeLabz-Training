package com.inheritance.assistedproblems.vehicle;

class Truck extends Vehicle{
	 public Truck(int maxSpeed, String fuelType){
		 super(maxSpeed,fuelType);  // parent class constructor
	 } 
	
	 @Override
	 void displayInfo() {
		 System.out.println("Maximum Speed of truck is : "+ this.maxSpeed);
		 System.out.println("Fuel Type of truck is : "+ this.fuelType);
	 }
	
}
