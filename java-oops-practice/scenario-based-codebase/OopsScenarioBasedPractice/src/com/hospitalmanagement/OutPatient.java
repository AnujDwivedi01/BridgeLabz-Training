package com.hospitalmanagement;

public class OutPatient extends Patient{
        public OutPatient(int patientId, String name) {
        	super(patientId,name);
        }
        
     // override the display info method
    	@Override
    	public void displayInfo() {
    		System.out.println(getSummary());
    		System.out.println("Type        : Out-Patient");
    		System.out.println("Doctor      : " + assignedDoctor.getDoctorInfo());
    	}

}
