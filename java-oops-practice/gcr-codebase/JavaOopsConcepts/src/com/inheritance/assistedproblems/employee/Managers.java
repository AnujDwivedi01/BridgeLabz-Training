package com.inheritance.assistedproblems.employee;

class Managers extends Employees{
	  public Managers(String name, int id, int salary) {
		  super(name,id,salary); // parent class constructor
	  }
	
}

class Developer extends Employees{
	public Developer(String name, int id, int salary) {
		  super(name,id,salary); // parent class constructor
	  }
}

class Intern extends Employees{
	public Intern(String name, int id, int salary) {
		  super(name,id,salary); // parent class constructor
	  }
}
