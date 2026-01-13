package com.trafficmanager;

import java.util.Scanner;

public class TrafficApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter max vehicles allowed in roundabout: ");
		int size = sc.nextInt();

		TrafficManager manager = new TrafficManager(size);

		while (true) {
			System.out.println("\n1. Add Vehicle");
			System.out.println("2. Remove Vehicle");
			System.out.println("3. Display Roundabout");
			System.out.println("4. Display Waiting Queue");
			System.out.println("5. Exit");
			System.out.print("Choose option: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter vehicle number: ");
				String number = sc.next();
				manager.addVehicle(number);
				break;

			case 2:
				manager.removeVehicle();
				break;

			case 3:
				manager.displayRoundabout();
				break;

			case 4:
				manager.displayQueue();
				break;

			case 5:
				System.out.println("Traffic system closed.");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
