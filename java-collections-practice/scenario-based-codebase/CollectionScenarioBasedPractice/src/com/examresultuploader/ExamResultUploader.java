package com.examresultuploader;

import java.util.*;

public class ExamResultUploader {

	public static void main(String[] args) {

		ResultProcessor processor = new ResultProcessor();
		TopScorerService scorerService = new TopScorerService();

		try {
			Map<String, List<Integer>> data = processor.process("D:\\material.csv.xlsx");

			System.out.println("🏆 Top Scorers By Subject:");

			data.forEach((subject, marks) -> {
				int top = scorerService.findTopScore(marks);
				System.out.println(subject + " → " + top);
			});

		} catch (InvalidFormatException e) {
			System.out.println("❌ Error: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
