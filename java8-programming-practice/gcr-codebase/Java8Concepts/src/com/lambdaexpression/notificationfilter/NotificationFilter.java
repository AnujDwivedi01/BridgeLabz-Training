package com.lambdaexpression.notificationfilter;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {

	public static void main(String[] args) {

		List<Alert> alerts = Arrays.asList(new Alert("Emergency", "Heart rate critical"),
				new Alert("Appointment", "Doctor visit at 10 AM"), new Alert("Info", "Drink more water"),
				new Alert("Emergency", "Blood pressure high"));

		// User preference: show ONLY Emergency alerts
		Predicate<Alert> emergencyOnly = alert -> alert.type.equalsIgnoreCase("Emergency");

		System.out.println(" Emergency Alerts:");
		alerts.stream().filter(emergencyOnly).forEach(System.out::println);
	}
}
