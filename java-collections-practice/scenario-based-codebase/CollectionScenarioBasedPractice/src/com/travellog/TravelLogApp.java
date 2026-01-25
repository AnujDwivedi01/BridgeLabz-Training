package com.travellog;

import java.util.*;

public class TravelLogApp {

	public static void main(String[] args) {

		String file = "trips.dat";

		try {
			// 🔹 Sample Data
			List<Trip> trips = List.of(new Trip("Paris", "France", 7, "Loved cafes in Paris and museums"),
					new Trip("Rome", "Italy", 4, "Rome history and food"),
					new Trip("Paris", "France", 6, "Paris nightlife and culture"),
					new Trip("Berlin", "Germany", 3, "Berlin wall and art scene"),
					new Trip("Rome", "Italy", 8, "Rome architecture and people"));

			// Write to disk
			TripWriter.writeTrips(trips, file);

			// Read from disk
			List<Trip> storedTrips = TripReader.readTrips(file);

			// 🔹 Trips longer than 5 days
			System.out.println("🧳 Trips > 5 days:");
			storedTrips.stream().filter(t -> t.getDurationDays() > 5).forEach(System.out::println);

			// 🔹 Unique countries
			Set<String> countries = new HashSet<>();
			for (Trip t : storedTrips) {
				countries.add(t.getCountry());
			}
			System.out.println("\n🌎 Unique Countries: " + countries);

			// 🔹 City visit count
			Map<String, Integer> cityCount = new HashMap<>();
			for (Trip t : storedTrips) {
				cityCount.put(t.getCity(), cityCount.getOrDefault(t.getCity(), 0) + 1);
			}

			// 🔹 Top 3 visited cities
			System.out.println("\n🏆 Top 3 Cities:");
			cityCount.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue()).limit(3)
					.forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
