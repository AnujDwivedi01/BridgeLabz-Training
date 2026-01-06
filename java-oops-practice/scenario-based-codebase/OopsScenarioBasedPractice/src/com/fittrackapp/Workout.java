package com.fittrackapp;

abstract class Workout implements ITrackable {
	protected String type;
	protected int duration; // in minutes
	protected int caloriesBurned;

	// Internal workout logs (restricted access)
	private boolean isActive;

	public Workout(String type, int duration) {
		this.type = type;
		this.duration = duration;
		this.caloriesBurned = 0;
		this.isActive = false;
	}

	@Override
	public void startWorkout() {
		isActive = true;
		System.out.println(type + " workout started.");
	}

	@Override
	public void stopWorkout() {
		isActive = false;
		calculateCalories();
		System.out.println(type + " workout stopped.");
	}

	public int getCaloriesBurned() {
		return caloriesBurned;
	}

	// Polymorphic method
	protected abstract void calculateCalories();
}
