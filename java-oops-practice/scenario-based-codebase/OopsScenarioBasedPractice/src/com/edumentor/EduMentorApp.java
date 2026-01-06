package com.edumentor;

public class EduMentorApp {
	public static void main(String[] args) {

		// Learner
		Learner learner = new Learner("Anuj", "anuj@email.com", "L101", "short");

		learner.getUserDetails();

		// Quiz
		Quiz quiz = new Quiz("easy");
		String[] userAnswers = { "4", "Delhi" };
		quiz.attemptQuiz(userAnswers);

		System.out.println("Quiz Score: " + quiz.getScore());
		System.out.println("Percentage: " + quiz.getPercentage() + "%");

		learner.updateProgress((int) quiz.getPercentage());
		learner.generateCertificate();

		System.out.println("\n-------------------------\n");

		// Instructor
		Instructor instructor = new Instructor("Dr. Sharma", "sharma@email.com", "I201", "AI & ML");

		instructor.getUserDetails();
		instructor.createQuiz();
		instructor.generateCertificate();
	}
}
