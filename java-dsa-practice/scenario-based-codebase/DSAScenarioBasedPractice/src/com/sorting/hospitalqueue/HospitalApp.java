package com.sorting.hospitalqueue;

public class HospitalApp {
       public static void main(String[] args) {
    	      
    	   Patient[] patients = {  new Patient("ravi", 4),
    			   new Patient("ravi", 4),
    			   new Patient("Anita", 9),
    			   new Patient("Karan", 6),
    			   new Patient("Meena", 10),
    			   new Patient("Suresh", 6),
    			   new Patient("Anuj", 8)
    	   };
    	   
    	   System.out.println("Befor Sorting --");
    	   HospitalQueue.dispalyPatients(patients);
    	   
    	   HospitalQueue.sortByCriticality(patients);
    	   
    	   System.out.println("\nAfter Sorting (High to low criticality) --");
    	   HospitalQueue.dispalyPatients(patients);
    			   
       }
}
