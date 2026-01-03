package com.cabbygoarideapp;

import java.util.Scanner;

public class CabbyGoApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== Welcome to CabbyGo ===");

		// Driver input
		System.out.print("Enter Driver Name: ");
		String driverName = sc.nextLine();
		System.out.print("Enter License Number: ");
		String license = sc.nextLine();
		System.out.print("Enter Driver Rating: ");
		double rating = sc.nextDouble();
		sc.nextLine();

		Driver driver = new Driver(driverName, license, rating);

		// Vehicle selection
		System.out.println("\nSelect Vehicle Type:");
		System.out.println("1. Mini");
		System.out.println("2. Sedan");
		System.out.println("3. SUV");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Vehicle Number: ");
		String vehicleNumber = sc.nextLine();

		Vehicle vehicle = null;

		switch (choice) {
		case 1:
			vehicle = new Mini(vehicleNumber);
			break;
		case 2:
			vehicle = new Sedan(vehicleNumber);
			break;
		case 3:
			vehicle = new SUV(vehicleNumber);
			break;
		default:
			System.out.println("Invalid vehicle type!");
			sc.close();
			return;
		}

		IRideService ride = new Ride(vehicle, driver);

		// Distance input
		System.out.print("\nEnter Ride Distance (km): ");
		double distance = sc.nextDouble();

		ride.bookRide(distance);
		ride.endRide();

		sc.close();
	}
}
