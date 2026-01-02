package com.hospitalmanagement;

public class HospitalManagement {
        public static void main(String[] args) {
        	 
        	Doctor doctor1 = new Doctor(1213, "Mr Anuj", "Cardiologist");
        	Doctor doctor2 = new Doctor(1214, "Mr Anupam", "Orthologist");
        	
        	Patient patient1 = new InPatient(221212 , "Vikash Prajapati", "Romantic Isssue",10);
        	patient1.assignDoctor(doctor1);
        	patient1.displayInfo();
        	
        	Bill bill = new Bill(500000);
        	bill.calculatePayment();
        	
        	Patient patient2 = new OutPatient(221219, "Vishal");
        	patient2.assignDoctor(doctor2);
        	
        	
        	
        	
        	
        	
        	
        	
        }
}
