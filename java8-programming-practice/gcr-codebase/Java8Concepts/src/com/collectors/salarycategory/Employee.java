package com.collectors.salarycategory;

class Employee {
	String name;
	String department;
	double salary;

	Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	String getDepartment() {
		return department;
	}

	double getSalary() {
		return salary;
	}
}