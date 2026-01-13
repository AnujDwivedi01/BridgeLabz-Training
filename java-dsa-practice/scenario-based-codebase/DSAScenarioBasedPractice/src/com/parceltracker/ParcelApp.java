package com.parceltracker;

import java.util.Scanner;

public class ParcelApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ParcelTracker tracker = new ParcelTracker();

		while (true) {
			System.out.println("\n1. Track Parcel");
			System.out.println("2. Add Checkpoint");
			System.out.println("3. Mark Parcel Lost");
			System.out.println("4. Exit");
			System.out.print("Choose option: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				tracker.trackParcel();
				break;

			case 2:
				System.out.print("Add after stage: ");
				String after = sc.nextLine();

				System.out.print("New checkpoint name: ");
				String stage = sc.nextLine();

				tracker.addCheckpoint(after, stage);
				break;

			case 3:
				tracker.markParcelLost();
				break;

			case 4:
				System.out.println("Tracking system closed.");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
