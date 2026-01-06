package com.fittrackapp;

class UserProfile {
	private String name;
	private int age;
	private double weight; // encapsulated (health data)
	private String goal;
	private int dailyCalorieTarget;

	// Constructor with default goal
	public UserProfile(String name, int age, double weight) {
		this(name, age, weight, "Maintain Fitness");
	}

	// Constructor with custom goal
	public UserProfile(String name, int age, double weight, String goal) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.goal = goal;
		this.dailyCalorieTarget = (int) (weight * 30); // operator usage
	}

	public int getDailyCalorieTarget() {
		return dailyCalorieTarget;
	}

	public void displayProfile() {
		System.out.println("User: " + name);
		System.out.println("Age: " + age);
		System.out.println("Goal: " + goal);
		System.out.println("Daily Calorie Target: " + dailyCalorieTarget);
	}
}
