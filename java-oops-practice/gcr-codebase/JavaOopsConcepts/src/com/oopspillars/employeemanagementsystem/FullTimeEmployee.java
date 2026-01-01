package com.oopspillars.employeemanagementsystem;

//Full-time employee with fixed salary
class FullTimeEmployee extends Employee {

 public FullTimeEmployee(int employeeId, String name, double baseSalary) {
     super(employeeId, name, baseSalary);
 }

 // Fixed salary calculation
 @Override
 public double calculateSalary() {
     return baseSalary;
 }
}

