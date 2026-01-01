package com.oopspillars.hospitalpatientmanagement;

//Main class
public class HospitalApp {

	public static void main(String[] args) {

		// Polymorphism: Patient reference
		Patient p1 = new InPatient(101, "Anuj", 30, 5, 3000);
		Patient p2 = new OutPatient(102, "Rahul", 25, 800);

		// Add medical records
		p1.addRecord("Appendicitis");
		p2.addRecord("Viral Fever");

		// Store patients together
		Patient[] patients = { p1, p2 };

		// Process patients dynamically
		for (Patient p : patients) {

			p.getPatientDetails();
			p.viewRecords();

			// Polymorphic bill calculation
			System.out.println("Total Bill : ₹" + p.calculateBill());
			System.out.println("--------------------------------");
		}
	}
}
