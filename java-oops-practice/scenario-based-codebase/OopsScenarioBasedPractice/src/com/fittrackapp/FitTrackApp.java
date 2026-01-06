package com.fittrackapp;

import java.util.Scanner;

public class FitTrackApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// User creation
		System.out.println("=== Welcome to FitTrack ===");
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		System.out.print("Enter Weight (kg): ");
		double weight = sc.nextDouble();
		sc.nextLine();

		System.out.print("Enter Fitness Goal (press Enter for default): ");
		String goal = sc.nextLine();

		UserProfile user = goal.isEmpty() ? new UserProfile(name, age, weight)
				: new UserProfile(name, age, weight, goal);

		user.displayProfile();

		// Workout selection
		System.out.println("\nSelect Workout Type:");
		System.out.println("1. Cardio");
		System.out.println("2. Strength");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();

		System.out.print("Enter Workout Duration (minutes): ");
		int duration = sc.nextInt();

		Workout workout;
		if (choice == 1) {
			workout = new CardioWorkout(duration);
		} else {
			workout = new StrengthWorkout(duration);
		}

		// Workout tracking
		workout.startWorkout();
		workout.stopWorkout();

		int burned = workout.getCaloriesBurned();
		int remaining = user.getDailyCalorieTarget() - burned; // operator usage

		System.out.println("\nCalories Burned: " + burned);
		System.out.println("Remaining Calories for Today: " + remaining);

		sc.close();
	}
}
