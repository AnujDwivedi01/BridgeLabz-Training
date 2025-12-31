package com.inheritance.assistedproblems.employee;

class Employee{
	
	//instance variable
	protected String name;
	protected int id;
	protected int salary;
	
	//constructor
	
	public Employee(String name,int id,int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	//details display
	
	void detailsDisplay() {
		System.out.println("\n Name of the employee is : " +this.name+ " ID is : "+ this.id+ " Salary is : "+this.salary);
	}
	
	
}

class Manager extends Employee{
	  public Manager(String name, int id, int salary) {
		  super(name,id,salary); // parent class constructor
	  }
	
}

class Developer extends Employee{
	public Developer(String name, int id, int salary) {
		  super(name,id,salary); // parent class constructor
	  }
}

class Intern extends Employee{
	public Intern(String name, int id, int salary) {
		  super(name,id,salary); // parent class constructor
	  }
}


public class EmployeeHierarchy {

	public static void main(String[] args) {
	      
		Employee  manager = new Manager("Jagdeesh Prasad",101,30000);
		manager.detailsDisplay();
		
		Employee developer = new Developer("Anuj Dwivedi",102,45000);
		developer.detailsDisplay();
		
		Employee intern = new Intern("Utkarsh",103,5000);
		intern.detailsDisplay();

	}

}
