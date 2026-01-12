package com.traincompartment;

public class Train {
	private Compartment head;
	private Compartment tail;
	
	
	 // add compartment at end
	 public void addCompartment(String name) {
		 Compartment newCompartment = new Compartment(name);
		 
		 if(head == null) {
			 head = tail = newCompartment;
		 }
		 
		 else {
			 tail.next = newCompartment;
			 newCompartment.prev = tail;
			 tail = newCompartment;
		 }
		 
		 
		 
	 }
	 
	 // remove a compartment	 
		 public void removeCompartment(String name) {
		        Compartment temp = head;

		        while (temp != null) {
		            if (temp.name.equalsIgnoreCase(name)) {

		                if (temp.prev != null)
		                    temp.prev.next = temp.next;
		                else
		                    head = temp.next;

		                if (temp.next != null)
		                    temp.next.prev = temp.prev;
		                else
		                    tail = temp.prev;

		                System.out.println(name + " removed");
		                return;
		            }
		            temp = temp.next;
		        }
		        System.out.println("Compartment not found");
		    
		 
	 }
		 
		 
		 // forward traversal
		 
		 public void traverseForward() {
			 Compartment temp = head;
			 System.out.println(" Forward ");
			 
			 while(temp != null) {
				 System.out.println(temp.name + "  ");
				 temp = temp.next;
			 }
			 
			 System.out.println();
		 }
		 
        // backword traversal
		 
		 public void traverseBackward() {
			 Compartment temp = tail;
			 System.out.println(" Backward ");
			 
			 while(temp != null) {
				 System.out.println(temp.name + "  ");
				 temp = temp.prev;
			 }
			 
			 System.out.println();
		 }
		 
		 // display adjacent compartment
		 public void showAdjacent(String name) {
			   Compartment temp = head;
			   
			   while(temp != null) {
				   if(temp.name.equalsIgnoreCase(name)) {
					   System.out.println("Current: " + temp.name);
		                System.out.println("Previous: " + (temp.prev != null ? temp.prev.name : "None"));
		                System.out.println("Next: " + (temp.next != null ? temp.next.name : "None"));
		                return;
				   }
				   temp = temp.next;
			   }
			   
		        System.out.println("Compartment not found");
			   
		 }
		 
		 

}

