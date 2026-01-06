package com.edumentor;

abstract class User {
	protected String name;
	protected String email;
	protected String userId;

	public User(String name, String email, String userId) {
		this.name = name;
		this.email = email;
		this.userId = userId;
	}

	public void getUserDetails() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("User ID: " + userId);
	}
}
