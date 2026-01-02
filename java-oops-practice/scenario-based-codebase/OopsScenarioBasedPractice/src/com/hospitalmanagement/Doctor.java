package com.hospitalmanagement;

public class Doctor {

	// instance variable
	private int doctorId;
	private String name;
	private String specilization;

	// constructor
	public Doctor(int doctorId, String name, String specilization) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.specilization = specilization;
	}
	
	public String getDoctorInfo() {
		 return  doctorId + "   name " + name + ": (Specilization) : " + specilization;
	}

}
