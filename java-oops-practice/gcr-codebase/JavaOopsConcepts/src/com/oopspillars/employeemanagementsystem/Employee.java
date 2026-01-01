package com.oopspillars.employeemanagementsystem;

//Abstract class representing common employee structure
abstract class Employee implements Department {

 // Encapsulated fields
 private int employeeId;
 private String name;
 protected double baseSalary; // protected for subclasses

 private String department;

 // Constructor to initialize employee data
 public Employee(int employeeId, String name, double baseSalary) {
     this.employeeId = employeeId;
     this.name = name;
     this.baseSalary = baseSalary;
 }

 // Getter methods (Encapsulation)
 public int getEmployeeId() {
     return employeeId;
 }

 public String getName() {
     return name;
 }

 // Interface method implementation
 @Override
 public void assignDepartment(String departmentName) {
     this.department = departmentName;
 }

 @Override
 public String getDepartmentDetails() {
     return department;
 }

 // Abstract method 
 public abstract double calculateSalary();

 // Concrete method
 public void displayDetails() {
     System.out.println("Employee ID   : " + employeeId);
     System.out.println("Name          : " + name);
     System.out.println("Department    : " + department);
     System.out.println("Final Salary  : ₹" + calculateSalary());
 }
}

