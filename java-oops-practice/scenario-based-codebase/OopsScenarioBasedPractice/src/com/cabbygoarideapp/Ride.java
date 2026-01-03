package com.cabbygoarideapp;

public class Ride implements IRideService {

	// instance variable
	private Vehicle vehicle;
	private Driver driver;
	private boolean rideActive;

	private static final double BASE_FARE = 50;

	public Ride(Vehicle vehicle, Driver driver) {
		this.vehicle = vehicle;
		this.driver = driver;
		this.rideActive = false;
	}

	@Override
	public void bookRide(double distance) {
		if (!rideActive) {
			vehicle.calculateFare(BASE_FARE, distance);
			rideActive = true;

			System.out.println("\n--- Ride Booked Successfully ---");
			System.out.println("Vehicle Type: " + vehicle.getType());
			driver.displayDriver();
			System.out.println("Distance: " + distance + " km");
			System.out.println("Fare: ₹" + vehicle.getFare());
		} else {
			System.out.println("Ride already active!");
		}
	}
	
	 @Override
	    public void endRide() {
	        if (rideActive) {
	            System.out.println("\nRide Ended.");
	            System.out.println("Total Fare Paid: ₹" + vehicle.getFare());
	            rideActive = false;
	        } else {
	            System.out.println("No active ride.");
	        }
	    }
}
