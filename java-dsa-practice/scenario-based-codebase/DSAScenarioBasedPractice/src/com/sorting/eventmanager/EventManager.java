package com.sorting.eventmanager;

public class EventManager {

	public static void quickSort(Ticket[] tickets, int low, int high) {
		if (low < high) {
			int pivot_index = partition(tickets, low, high);
			quickSort(tickets, low, pivot_index - 1);
			quickSort(tickets, pivot_index + 1, high);
            
		}
	}
	
	 private static int partition(Ticket[] tickets, int low, int high) {

	        double pivot = tickets[high].price;  // pivot element
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (tickets[j].price <= pivot) {
	                i++;
	                swap(tickets, i, j);
	            }
	        }

	        swap(tickets, i + 1, high);
	        return i + 1;
	    }
	 
	 private static void swap(Ticket[] tickets, int i, int j) {
	        Ticket temp = tickets[i];
	        tickets[i] = tickets[j];
	        tickets[j] = temp;
	    }
	 
	 public static void display(Ticket[] tickets, int limit) {
	        for (int i = 0; i < limit && i < tickets.length; i++) {
	            System.out.println("Ticket ID: " + tickets[i].ticketId +
	                               " | Price: ₹" + tickets[i].price);
	        }
	    }
}
