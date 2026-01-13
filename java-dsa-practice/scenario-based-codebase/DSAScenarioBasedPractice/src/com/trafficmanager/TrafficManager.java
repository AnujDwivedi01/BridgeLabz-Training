package com.trafficmanager;

import java.util.*;

class TrafficManager {

	private Vehicle head = null;
	private int maxSize;
	private int currentSize = 0;

	private Queue<String> waitingQueue = new LinkedList<>();

	public TrafficManager(int maxSize) {
		this.maxSize = maxSize;
	}

	// Add vehicle
	public void addVehicle(String number) {

		if (currentSize == maxSize) {
			waitingQueue.offer(number);
			System.out.println("Roundabout full. Vehicle added to waiting queue.");
			return;
		}

		Vehicle newVehicle = new Vehicle(number);

		if (head == null) {
			head = newVehicle;
			newVehicle.next = head;
		} else {
			Vehicle temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = newVehicle;
			newVehicle.next = head;
		}

		currentSize++;
		System.out.println("Vehicle entered roundabout.");
	}

	// Remove vehicle
	public void removeVehicle() {

		if (head == null) {
			System.out.println("Roundabout empty. Underflow!");
			return;
		}

		if (head.next == head) {
			head = null;
		} else {
			Vehicle temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			head = head.next;
			temp.next = head;
		}

		currentSize--;
		System.out.println("Vehicle exited roundabout.");

		// Move from queue to roundabout if available
		if (!waitingQueue.isEmpty()) {
			addVehicle(waitingQueue.poll());
		}
	}

	// Display roundabout
	public void displayRoundabout() {

		if (head == null) {
			System.out.println("Roundabout is empty.");
			return;
		}

		System.out.print("Roundabout vehicles: ");
		Vehicle temp = head;
		do {
			System.out.print(temp.number + " -> ");
			temp = temp.next;
		} while (temp != head);
		System.out.println("(back to start)");
	}

	// Display queue
	public void displayQueue() {
		System.out.println("Waiting Queue: " + waitingQueue);
	}
}
