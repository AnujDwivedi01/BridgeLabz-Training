package com.annotations.practiceproblems.importantmethods;

public class ServiceTasks {

	@ImportantMethod
	public void processPayment() {
		System.out.println("Processing payment...");
	}

	@ImportantMethod(level = "MEDIUM")
	public void generateReport() {
		System.out.println("Generating report...");
	}

	public void normalTask() {
		System.out.println("Normal task execution...");
	}
}
