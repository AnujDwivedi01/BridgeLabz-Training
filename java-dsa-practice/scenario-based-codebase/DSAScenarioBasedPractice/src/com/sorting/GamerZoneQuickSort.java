package com.sorting;

import java.util.*;

public class GamerZoneQuickSort {

	// Player model
	static class Player {
		int playerId;
		String name;
		int score;

		Player(int playerId, String name, int score) {
			this.playerId = playerId;
			this.name = name;
			this.score = score;
		}

		@Override
		public String toString() {
			return "ID: " + playerId + ", Name: " + name + ", Score: " + score;
		}
	}

	// Quick Sort (Descending Order)
	public static void quickSort(List<Player> list, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(list, low, high);
			quickSort(list, low, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, high);
		}
	}

	// Partition logic
	private static int partition(List<Player> list, int low, int high) {
		int pivot = list.get(high).score;
		int i = low - 1;

		for (int j = low; j < high; j++) {
			// Descending order
			if (list.get(j).score > pivot) {
				i++;
				swap(list, i, j);
			}
		}

		swap(list, i + 1, high);
		return i + 1;
	}

	// Swap utility
	private static void swap(List<Player> list, int i, int j) {
		Player temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	// Display leaderboard
	private static void display(List<Player> players) {
		if (players.isEmpty()) {
			System.out.println("No player data available.");
			return;
		}

		int rank = 1;
		for (Player p : players) {
			System.out.println("Rank " + rank++ + " → " + p);
		}
	}

	// Main with user input and switch
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Player> players = new ArrayList<>();
		int choice;

		do {
			System.out.println("\n===== GamerZone Leaderboard Menu =====");
			System.out.println("1. Add Player Score");
			System.out.println("2. Display Leaderboard");
			System.out.println("3. Sort Leaderboard (Quick Sort)");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {

			case 1:
				System.out.print("Enter Player ID: ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Player Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Player Score: ");
				int score = sc.nextInt();

				players.add(new Player(id, name, score));
				System.out.println("Player added successfully.");
				break;

			case 2:
				System.out.println("\n--- Current Leaderboard ---");
				display(players);
				break;

			case 3:
				if (players.isEmpty()) {
					System.out.println("No players to sort.");
				} else {
					quickSort(players, 0, players.size() - 1);
					System.out.println("\nLeaderboard sorted by score (High → Low):");
					display(players);
				}
				break;

			case 4:
				System.out.println("Exiting GamerZone system.");
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}

		} while (choice != 4);

		sc.close();
	}
}
