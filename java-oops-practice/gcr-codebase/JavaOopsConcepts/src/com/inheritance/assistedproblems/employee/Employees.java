package com.inheritance.assistedproblems.employee;

class Employees{
	
	//instance variable
	protected String name;
	protected int id;
	protected int salary;
	
	//constructor
	
	public Employees(String name,int id,int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	//details display
	
	void detailsDisplay() {
		System.out.println("\n Name of the employee is : " +this.name+ " ID is : "+ this.id+ " Salary is : "+this.salary);
	}
	
	
}

