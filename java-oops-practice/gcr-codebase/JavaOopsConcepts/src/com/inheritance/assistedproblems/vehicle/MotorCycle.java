package com.inheritance.assistedproblems.vehicle;

class MotorCycle extends Vehicle{
	
	 public MotorCycle(int maxSpeed, String fuelType){
		 super(maxSpeed,fuelType);  // parent class constructor
	 } 
	
	 @Override
	 void displayInfo() {
		 System.out.println("Maximum motor cycle  of motor cycle is : "+ this.maxSpeed);
		 System.out.println("Fuel Type of motor cycle is : "+ this.fuelType);
	 }
	   
}

