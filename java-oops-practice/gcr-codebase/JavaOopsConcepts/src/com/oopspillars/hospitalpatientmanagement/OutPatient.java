package com.oopspillars.hospitalpatientmanagement;

//Out-patient visiting hospital for consultation
class OutPatient extends Patient {

	private double consultationFee;

	public OutPatient(int patientId, String name, int age, double consultationFee) {
		super(patientId, name, age);
		this.consultationFee = consultationFee;
	}

	// Billing logic for out-patient
	@Override
	public double calculateBill() {
		return consultationFee;
	}
}
