package com.examscanner;

import java.io.*;
import java.util.*;

public class ExamScanner {

	public static void main(String[] args) throws Exception {

		List<Character> answerKey = Arrays.asList('A', 'B', 'C', 'D', 'A', 'B', 'C');

		Map<String, Integer> scoreMap = new HashMap<>();
		Evaluator<Character> evaluator = new Evaluator<>();

		BufferedReader br = new BufferedReader(new FileReader("D:\\material.csv.xlsx"));
		String line;

		while ((line = br.readLine()) != null) {

			if (!AnswerValidator.isValidFormat(line)) {
				System.out.println("Invalid Format: " + line);
				continue;
			}

			String[] parts = line.split(",");
			String name = parts[0];

			List<Character> answers = new ArrayList<>();
			for (int i = 1; i < parts.length; i++) {
				answers.add(parts[i].charAt(0));
			}

			AnswerSheet<Character> sheet = new MathAnswerSheet(name, answers);

			int score = evaluator.calculateScore(sheet, answerKey);
			scoreMap.put(name, score);
		}

		PriorityQueue<Result> pq = new PriorityQueue<>((a, b) -> b.score - a.score);

		scoreMap.forEach((name, score) -> pq.add(new Result(name, score)));

		System.out.println("🏆 Results:");
		while (!pq.isEmpty()) {
			Result r = pq.poll();
			System.out.println(r.studentName + " : " + r.score);
		}
	}
}
