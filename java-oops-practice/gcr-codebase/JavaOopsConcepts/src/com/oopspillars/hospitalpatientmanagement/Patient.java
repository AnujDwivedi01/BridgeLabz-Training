package com.oopspillars.hospitalpatientmanagement;

//Abstract class representing a generic patient
abstract class Patient implements MedicalRecord {

	// Encapsulated fields (secure patient data)
	private int patientId;
	private String name;
	private int age;

	// Sensitive data kept private
	private String diagnosis;

	// Constructor to initialize patient details
	public Patient(int patientId, String name, int age) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}

	// Getter methods (controlled access)
	public int getPatientId() {
		return patientId;
	}

	public String getName() {
		return name;
	}

	// Concrete method to display common patient details
	public void getPatientDetails() {
		System.out.println("Patient ID : " + patientId);
		System.out.println("Name       : " + name);
		System.out.println("Age        : " + age);
	}

	// MedicalRecord interface methods
	@Override
	public void addRecord(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	@Override
	public void viewRecords() {
		System.out.println("Diagnosis  : " + diagnosis);
	}

	// Abstract method to calculate bill
	public abstract double calculateBill();
}
