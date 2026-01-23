package com.regex;

public class IPValidator {

	public static boolean isValidIPv4(String ip) {

		String regex = "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}" + "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";

		return ip.matches(regex);
	}

	public static void main(String[] args) {

		System.out.println(isValidIPv4("192.168.1.1")); // true
		System.out.println(isValidIPv4("255.255.255.0")); // true
		System.out.println(isValidIPv4("256.100.10.1")); // false
		System.out.println(isValidIPv4("192.168.1")); // false
		System.out.println(isValidIPv4("01.2.3.4")); // false
	}
}
