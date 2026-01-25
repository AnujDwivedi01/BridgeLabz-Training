package com.resumeanalyzer;

import java.io.*;
import java.util.*;

public class ResumeAnalyzer {

	private static final List<String> KEYWORDS = List.of("java", "python", "spring");

	public static void main(String[] args) {

		File folder = new File("resumes");
		Map<String, ResumeData> resumeMap = new HashMap<>();
		List<ResumeData> sortedCandidates = new ArrayList<>();

		for (File file : folder.listFiles()) {
			try {
				if (!file.getName().endsWith(".txt") && !file.getName().endsWith(".pdf")) {
					throw new UnsupportedOperationException("Invalid format");
				}

				String content = ResumeReader.readTextFile(file).toLowerCase();

				String email = RegexUtil.extractEmail(content);
				String phone = RegexUtil.extractPhone(content);

				if (email == null)
					throw new IllegalArgumentException("Email not found");

				List<String> matchedSkills = new ArrayList<>();
				for (String skill : KEYWORDS) {
					if (content.contains(skill)) {
						matchedSkills.add(skill);
					}
				}

				ResumeData data = new ResumeData(email, phone, matchedSkills);

				resumeMap.put(email, data);
				sortedCandidates.add(data);

			} catch (Exception e) {
				System.out.println("Skipping " + file.getName() + " → " + e.getMessage());
			}
		}

		// 🔽 Sort by keyword match count (Descending)
		sortedCandidates.sort((a, b) -> b.getKeywordCount() - a.getKeywordCount());

		System.out.println("\n Sorted Candidates:");
		sortedCandidates.forEach(System.out::println);
	}
}
