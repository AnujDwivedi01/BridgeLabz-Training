package com.sorting.examcell;

public class Student {

	private String name;
	private int score;

	// constructor
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + " - Score: " + score;
	}
}
