package com.oopspillars.employeemanagementsystem;

//Part-time employee paid based on hours worked
class PartTimeEmployee extends Employee {

       private int hoursWorked;
       private double hourlyRate;

   public PartTimeEmployee(int employeeId, String name,
                         int hoursWorked, double hourlyRate) {
     super(employeeId, name, 0);
     this.hoursWorked = hoursWorked;
     this.hourlyRate = hourlyRate;
 }

      // Salary based on hours worked
      @Override
      public double calculateSalary() {
     return hoursWorked * hourlyRate;
 }
}

