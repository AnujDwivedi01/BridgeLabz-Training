package com.examproctor;

import java.util.*;

class ExamProctor {

	private Stack<Integer> navigationStack = new Stack<>();
	private HashMap<Integer, String> answerMap = new HashMap<>();
	private HashMap<Integer, String> correctAnswers = new HashMap<>();

	public ExamProctor() {
		// Predefined correct answers
		correctAnswers.put(1, "A");
		correctAnswers.put(2, "B");
		correctAnswers.put(3, "C");
		correctAnswers.put(4, "D");
	}

	// Visit a question
	public void visitQuestion(int questionId) {
		navigationStack.push(questionId);
		System.out.println("Visited Question: " + questionId);
	}

	// Save answer
	public void saveAnswer(int questionId, String answer) {
		answerMap.put(questionId, answer);
		System.out.println("Answer saved for Question " + questionId);
	}

	// Go back to last question
	public void goBack() {
		if (navigationStack.isEmpty()) {
			System.out.println("No previous question!");
			return;
		}
		int last = navigationStack.pop();
		System.out.println("Returned from Question: " + last);
	}

	// Evaluate score (function)
	public int calculateScore() {
		int score = 0;

		for (int qId : correctAnswers.keySet()) {
			if (answerMap.containsKey(qId) && answerMap.get(qId).equalsIgnoreCase(correctAnswers.get(qId))) {
				score++;
			}
		}
		return score;
	}

	// Submit exam
	public void submitExam() {
		int score = calculateScore();
		System.out.println("\nExam Submitted!");
		System.out.println("Total Score: " + score + "/" + correctAnswers.size());
	}
}
