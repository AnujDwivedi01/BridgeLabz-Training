package com.resumeanalyzer;

import java.util.*;

public class ResumeData {
	private String email;
	private String phone;
	private List<String> skills;
	private int keywordCount;

	public ResumeData(String email, String phone, List<String> skills) {
		this.email = email;
		this.phone = phone;
		this.skills = skills;
		this.keywordCount = skills.size();
	}

	public int getKeywordCount() {
		return keywordCount;
	}

	@Override
	public String toString() {
		return "Email: " + email + ", Phone: " + phone + ", Skills: " + skills + ", MatchCount: " + keywordCount;
	}
}
