package com.hospitalmanagement;

public abstract class Patient {
	// instance variable
	private int patientId;
	private String name;
	private String medicalHistory;
	protected Doctor assignedDoctor;

	// constructor for normal patient
	public Patient(int patientId, String name) {
		this.patientId = patientId;
		this.name = name;
	}

	// Overloaded constructor for emergency patient
	public Patient(int patientId, String name, String medicalHistory) {
		this.patientId = patientId;
		this.name = name;
		this.medicalHistory = medicalHistory;
	}

	// for medical history

	public String getSummary() {
		return "Patient Id  : " + patientId + " Patient name : " + name ;
	}

	// assigining doctor

	public void assignDoctor(Doctor doctor) {
		this.assignedDoctor = doctor;
	}

	// displayinfo
	public abstract void displayInfo();
}
