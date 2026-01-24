package com.annotations.practiceproblems.logintimes;

public class PerformanceService {

	@LogExecutionTime
	public void fastTask() {
		for (int i = 0; i < 1_000; i++) {
			// simulate small work
		}
	}

	@LogExecutionTime
	public void slowTask() {
		for (int i = 0; i < 10_000_000; i++) {
			// simulate heavy work
		}
	}

	public void normalTask() {
		System.out.println("Normal task (not measured)");
	}
}
