package com.examscanner;

import java.util.List;

public class MathAnswerSheet implements AnswerSheet<Character> {

	private String studentName;
	private List<Character> answers;

	public MathAnswerSheet(String studentName, List<Character> answers) {
		this.studentName = studentName;
		this.answers = answers;
	}

	@Override
	public String getStudentName() {
		return studentName;
	}

	@Override
	public List<Character> getAnswers() {
		return answers;
	}
}
