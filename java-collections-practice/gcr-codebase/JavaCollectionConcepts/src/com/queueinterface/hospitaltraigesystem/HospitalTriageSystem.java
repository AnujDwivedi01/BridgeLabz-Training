package com.queueinterface.hospitaltraigesystem;

import java.util.PriorityQueue;

public class HospitalTriageSystem {

	public static void main(String[] args) {

		// PriorityQueue with custom comparator (max-heap behavior)
		PriorityQueue<Patient> triageQueue = new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity);

		// Adding patients
		triageQueue.add(new Patient("John", 3));
		triageQueue.add(new Patient("Alice", 5));
		triageQueue.add(new Patient("Bob", 2));

		System.out.println("Treatment Order:");

		// Treat patients based on severity
		while (!triageQueue.isEmpty()) {
			Patient p = triageQueue.poll();
			System.out.println(p.name + " (Severity: " + p.severity + ")");
		}
	}
}