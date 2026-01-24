package com.annotations.practiceproblems.logintimes;

public class MainApp {

	public static void main(String[] args) {

		PerformanceService service = new PerformanceService();

		ExecutionTimeProcessor.executeWithLogging(service);
	}
}
