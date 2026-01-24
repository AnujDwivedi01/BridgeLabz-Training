package com.annotations.practiceproblems.todoannotation;

public class ProjectTasks {

	@Todo(task = "Implement user authentication", assignedTo = "Anuj", priority = "HIGH")
	public void authFeature() {
	}

	@Todo(task = "Add logging support", assignedTo = "Ravi")
	public void loggingFeature() {
	}

	@Todo(task = "Optimize database queries", assignedTo = "Sneha", priority = "LOW")
	public void optimizationTask() {
	}
}
