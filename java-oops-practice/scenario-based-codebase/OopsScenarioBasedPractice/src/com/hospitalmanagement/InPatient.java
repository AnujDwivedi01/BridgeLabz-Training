package com.hospitalmanagement;

public   class InPatient extends Patient {

	private int daysAdmitted;

	public  InPatient(int patientId, String name, String medicalHistory,int daysAdmitted) {
		super(patientId,name,medicalHistory);
		this.daysAdmitted = daysAdmitted;
	}

	// override the display info method
	@Override
	public void displayInfo() {
		System.out.println(getSummary());
		System.out.println("Type        : In-Patient");
		System.out.println("Days Stayed : " + daysAdmitted);
		System.out.println("Doctor      : " + assignedDoctor.getDoctorInfo());
	}

	public int getDaysAdmitted() {
		return daysAdmitted;
	}
}
