package com.edumentor;

class Learner extends User implements ICertifiable {
	private int progress; // percentage
	private String courseType; // short / full-time

	public Learner(String name, String email, String userId, String courseType) {
		super(name, email, userId);
		this.courseType = courseType;
		this.progress = 0;
	}

	public void updateProgress(int progress) {
		this.progress = progress;
	}

	@Override
	public void generateCertificate() {
		if (courseType.equalsIgnoreCase("short")) {
			System.out.println("Short Course Certificate generated for " + name);
		} else {
			System.out.println("Full-Time Course Completion Certificate generated for " + name);
		}
	}
}
