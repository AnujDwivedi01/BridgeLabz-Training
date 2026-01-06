package com.edumentor;

class Quiz {
	private String[] questions; // encapsulated
	private String[] answers; // encapsulated
	private int score;
	private String difficulty;

	// Constructor with difficulty
	public Quiz(String difficulty) {
        this.difficulty = difficulty;

        if (difficulty.equalsIgnoreCase("easy")) {
            questions = new String[]{"2+2?", "Capital of India?"};
            answers = new String[]{"4", "Delhi"};
        } else {
            questions = new String[]{"5*6?", "Square root of 144?"};
            answers = new String[]{"30", "12"};
        }
        score = 0;
    }
	 // Attempt quiz
    public void attemptQuiz(String[] userAnswers) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equalsIgnoreCase(userAnswers[i])) {
                score += 10; // operator usage
            }
        }
    }

    public int getScore() {
        return score;
    }

    public double getPercentage() {
        return (score * 100.0) / (answers.length * 10);
    }
}