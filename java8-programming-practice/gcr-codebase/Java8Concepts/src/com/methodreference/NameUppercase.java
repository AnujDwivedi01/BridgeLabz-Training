package com.methodreference;

import java.util.*;

public class NameUppercase {

	public static void main(String[] args) {

		List<String> employeeNames = Arrays.asList("Anuj", "Rahul", "Neha", "Priya");

		// Convert names to uppercase using method reference
		employeeNames.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}
