package com.chatlogparser;

import java.util.List;

public class IdleChatFilter implements MessageFilter<String> {

	private List<String> idleKeywords = List.of("lol", "brb", "ok", "haha");

	@Override
	public boolean allow(String message) {
		String msg = message.toLowerCase();
		return idleKeywords.stream().noneMatch(msg::contains);
	}
}
