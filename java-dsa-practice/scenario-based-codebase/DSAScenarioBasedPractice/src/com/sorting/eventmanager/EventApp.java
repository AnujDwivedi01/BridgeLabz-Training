package com.sorting.eventmanager;

public class EventApp {

	public static void main(String[] args) {

		Ticket[] tickets = { new Ticket(101, 2500), new Ticket(102, 1200), new Ticket(103, 4500), new Ticket(104, 800),
				new Ticket(105, 3000), new Ticket(106, 1500) };

		System.out.println("Before Sorting:");
		EventManager.display(tickets, tickets.length);

		EventManager.quickSort(tickets, 0, tickets.length - 1);

		System.out.println("\nTop 3 Cheapest Tickets:");
		EventManager.display(tickets, 3);

		System.out.println("\nTop 3 Costliest Tickets:");
		for (int i = tickets.length - 1; i >= tickets.length - 3; i--) {
			System.out.println("Ticket ID: " + tickets[i].ticketId + " | Price: ₹" + tickets[i].price);
		}
	}
}
