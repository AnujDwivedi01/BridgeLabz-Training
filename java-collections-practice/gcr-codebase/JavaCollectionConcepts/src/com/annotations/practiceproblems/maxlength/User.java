package com.annotations.practiceproblems.maxlength;

import java.lang.reflect.Field;

public class User {

	@MaxLength(10)
	private String username;

	public User(String username) {

		try {
			Field field = this.getClass().getDeclaredField("username");
			MaxLength maxLength = field.getAnnotation(MaxLength.class);

			if (maxLength != null && username.length() > maxLength.value()) {
				throw new IllegalArgumentException("Username length must be at most " + maxLength.value());
			}

			this.username = username;

		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

	public String getUsername() {
		return username;
	}
}
