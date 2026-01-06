package com.fittrackapp;

class StrengthWorkout extends Workout {

	public StrengthWorkout(int duration) {
		super("Strength", duration);
	}

	@Override
	protected void calculateCalories() {
		caloriesBurned = duration * 5; // lower burn
	}
}
