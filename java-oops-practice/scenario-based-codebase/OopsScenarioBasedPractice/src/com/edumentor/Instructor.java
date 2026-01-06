package com.edumentor;

class Instructor extends User implements ICertifiable {
	private String expertise;

	public Instructor(String name, String email, String userId, String expertise) {
		super(name, email, userId);
		this.expertise = expertise;
	}

	public void createQuiz() {
		System.out.println("Quiz created by Instructor: " + name);
	}

	@Override
	public void generateCertificate() {
		System.out.println("Instructor Achievement Certificate generated for " + name);
	}
}
