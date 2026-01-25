package com.chatlogparser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogParser {

	private static final Pattern CHAT_PATTERN = Pattern.compile("\\[(.*?)\\]\\s(.*?):\\s(.*)");

	private MessageFilter<String> filter;

	public ChatLogParser(MessageFilter<String> filter) {
		this.filter = filter;
	}

	public Map<String, List<String>> parse(String filePath) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line;

		Map<String, List<String>> chatMap = new TreeMap<>();

		while ((line = br.readLine()) != null) {

			Matcher matcher = CHAT_PATTERN.matcher(line);
			if (!matcher.matches())
				continue;

			String timestamp = matcher.group(1);
			String user = matcher.group(2);
			String message = matcher.group(3);

			if (!filter.allow(message))
				continue;

			chatMap.computeIfAbsent(user, k -> new ArrayList<>()).add("[" + timestamp + "] " + message);
		}
		return chatMap;
	}
}
