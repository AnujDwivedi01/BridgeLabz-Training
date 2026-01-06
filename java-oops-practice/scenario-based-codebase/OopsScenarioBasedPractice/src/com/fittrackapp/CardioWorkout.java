package com.fittrackapp;

class CardioWorkout extends Workout {

	public CardioWorkout(int duration) {
		super("Cardio", duration);
	}

	@Override
	protected void calculateCalories() {
		caloriesBurned = duration * 8; // higher burn
	}
}
