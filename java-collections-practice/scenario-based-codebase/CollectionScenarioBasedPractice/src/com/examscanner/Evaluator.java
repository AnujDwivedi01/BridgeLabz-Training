package com.examscanner;

import java.util.List;

public class Evaluator<T> {

	public int calculateScore(AnswerSheet<T> sheet, List<T> answerKey) {
		int score = 0;

		List<T> answers = sheet.getAnswers();
		for (int i = 0; i < answers.size(); i++) {
			if (answers.get(i).equals(answerKey.get(i))) {
				score++;
			}
		}
		return score;
	}
}
