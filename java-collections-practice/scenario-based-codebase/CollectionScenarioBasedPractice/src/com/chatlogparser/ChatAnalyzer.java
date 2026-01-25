package com.chatlogparser;

import java.util.*;

public class ChatAnalyzer {

	public static void main(String[] args) {

		MessageFilter<String> filter = new IdleChatFilter();
		ChatLogParser parser = new ChatLogParser(filter);

		try {
			Map<String, List<String>> result = parser.parse("D:\\filehandling\\file1.txt");

			result.forEach((user, messages) -> {
				System.out.println("User: " + user);
				messages.forEach(m -> System.out.println("  " + m));
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
