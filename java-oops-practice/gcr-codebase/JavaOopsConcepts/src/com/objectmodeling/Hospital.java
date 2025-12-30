package com.objectmodeling;
import java.util.ArrayList;
import java.util.List;

class Doctor {

    private String doctorName;
    private String specialization;
    private List<Patient> patients;

    // Constructor
    public Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Doctor consults a patient (communication)
    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);

        System.out.println("Doctor " + doctorName +
                " is consulting Patient " + patient.getPatientName());
    }

    public String getDoctorName() {
        return doctorName;
    }

    // Show all patients consulted by this doctor
    public void showPatients() {
        System.out.println("Patients consulted by Dr. " + doctorName + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.getPatientName());
        }
    }
}


class Patient {

    private String patientName;
    private int age;
    private List<Doctor> doctors;

    // Constructor
    public Patient(String patientName, int age) {
        this.patientName = patientName;
        this.age = age;
        this.doctors = new ArrayList<>();
    }

    // Add doctor to patient's list
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public String getPatientName() {
        return patientName;
    }

    // Show doctors consulted by patient
    public void showDoctors() {
        System.out.println("Doctors consulted by " + patientName + ":");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getDoctorName());
        }
    }
}


public class Hospital {
	private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    // Constructor
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public static void main(String[] args) {

        // Create Hospital
        Hospital hospital = new Hospital("City Care Hospital");

        // Create Doctors
        Doctor d1 = new Doctor("Rajesh", "Cardiology");
        Doctor d2 = new Doctor("Anita", "Neurology");

        // Create Patients
        Patient p1 = new Patient("Rahul", 30);
        Patient p2 = new Patient("Sneha", 25);

        // Add to hospital
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Consultations (Association + Communication)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        System.out.println();

        // Display relationships
        d1.showPatients();
        d2.showPatients();

        System.out.println();

        p1.showDoctors();
        p2.showDoctors();
    }

}
