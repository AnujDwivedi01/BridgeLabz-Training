package com.annotations.practiceproblems.maxlength;

public class MainApp {

	public static void main(String[] args) {

		// Valid username
		User user1 = new User("Anuj");
		System.out.println("User created: " + user1.getUsername());

		// Invalid username (exceeds max length)
		User user2 = new User("VeryLongUsername");
	}
}
