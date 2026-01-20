package com.mapinterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystem {

	// Stores total votes (fast access)
	private HashMap<String, Integer> voteCount = new HashMap<>();

	// Maintains order in which votes were cast
	private LinkedHashMap<Integer, String> voteOrder = new LinkedHashMap<>();

	private int voteId = 1;

	// Cast a vote
	public void castVote(String candidate) {

		// Update HashMap vote count
		voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);

		// Maintain order of votes
		voteOrder.put(voteId++, candidate);
	}

	// Display votes in insertion order
	public void displayVoteOrder() {
		System.out.println("\nVote Casting Order:");
		for (Map.Entry<Integer, String> entry : voteOrder.entrySet()) {
			System.out.println("Vote " + entry.getKey() + " -> " + entry.getValue());
		}
	}

	// Display results in sorted order
	public void displaySortedResults() {

		TreeMap<String, Integer> sortedResults = new TreeMap<>(voteCount);

		System.out.println("\nFinal Results (Sorted by Candidate):");
		for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static void main(String[] args) {

		VotingSystem vs = new VotingSystem();

		vs.castVote("Alice");
		vs.castVote("Bob");
		vs.castVote("Alice");
		vs.castVote("Charlie");
		vs.castVote("Bob");

		vs.displayVoteOrder();
		vs.displaySortedResults();
	}
}
