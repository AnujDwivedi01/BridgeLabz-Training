package com.oopspillars.employeemanagementsystem;

//Main class
public class EmployeeApp {

 public static void main(String[] args) {

     //  Employee reference
     Employee e1 = new FullTimeEmployee(101, "Anuj", 50000);
     Employee e2 = new PartTimeEmployee(102, "Rahul", 80, 500);

     // Assign departments
     e1.assignDepartment("IT");
     e2.assignDepartment("Support");

     // Process employees using Employee reference
     Employee[] employees = { e1, e2 };

     for (Employee emp : employees) {
         emp.displayDetails();
         System.out.println();
     }
 }
}

