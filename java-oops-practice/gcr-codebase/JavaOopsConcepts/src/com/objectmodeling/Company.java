package com.objectmodeling;
import java.util.ArrayList;

 // Employee class
 class Employee {

    private String empName;
    
    
    // constructors
    public Employee(String empName) {
        this.empName = empName;
    }
    
    
    
    public void displayEmployee() {
        System.out.println("    Employee: " + empName);
    }
}
 

 // Department class
  class Department {

     private String deptName;
     private ArrayList<Employee> employees;

     public Department(String deptName) {
         this.deptName = deptName;
         this.employees = new ArrayList<>();
     }

     // Add employee to department
     public void addEmployee(String empName) {
         Employee emp = new Employee(empName); // created inside department
         employees.add(emp);
     }

     // Display department details
     public void displayDepartment() {
         System.out.println("  Department: " + deptName);
         for (Employee emp : employees) {
             emp.displayEmployee();
         }
     }
 }


// class company
public class Company {
	 private String companyName;
	 private ArrayList <Department> departments;

	    public Company(String companyName) {
	        this.companyName = companyName;
	        this.departments = new ArrayList<>();
	    }

	    // Add department to company
	    public void addDepartment(Department department) {
	        departments.add(department);
	    }

	    // Display company structure
	    public void displayCompany() {
	        System.out.println("Company: " + companyName);
	        for (Department dept : departments) {
	            dept.displayDepartment();
	        }
	    }

	    
	    public static void main(String[] args) {

	        // Create company
	        Company company = new Company("Tech Solutions Pvt Ltd");

	        // Create departments
	        Department itDept = new Department("IT");
	        Department hrDept = new Department("HR");

	        // Add employees (created inside departments)
	        itDept.addEmployee("Anuj");
	        itDept.addEmployee("Rahul");

	        hrDept.addEmployee("Sneha");

	        // Add departments to company
	        company.addDepartment(itDept);
	        company.addDepartment(hrDept);

	        // Display full company structure
	        company.displayCompany();

	        // Deleting company 
	        company = null;

	        System.out.println("\nCompany deleted. All departments and employees are removed.");
	    }
     
}
