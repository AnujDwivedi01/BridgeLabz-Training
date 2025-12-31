package com.inheritance.assistedproblems.vehicle;

class Car extends Vehicle{
	 public Car(int maxSpeed, String fuelType){
		 super(maxSpeed,fuelType);  // parent class constructor
	 } 
	
	 @Override
	 void displayInfo() {
		 System.out.println("Maximum Speed of car is : "+ this.maxSpeed);
		 System.out.println("Fuel Type of car is : "+ this.fuelType);
	 }
	 
}
