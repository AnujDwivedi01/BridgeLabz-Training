package com.inheritance.assistedproblems.vehicle;



public class VehicleHierarchy {

	public static void main(String[] args) {
		   Vehicle car = new Car(150,"Petrol");
		   car.displayInfo();
		   
		   Vehicle truck = new Truck(70,"Diesel");
		   truck.displayInfo();
		   
		   Vehicle motorCycle = new MotorCycle(90,"CNG");
		   motorCycle.displayInfo();
		   
		   
		   

	}

}

