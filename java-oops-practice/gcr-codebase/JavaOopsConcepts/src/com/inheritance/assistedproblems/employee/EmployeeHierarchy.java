package com.inheritance.assistedproblems.employee;





public class EmployeeHierarchy {

	public static void main(String[] args) {
	      
		Employees  manager = new Managers("Jagdeesh Prasad",101,30000);
		manager.detailsDisplay();
		
		Employees developer = new Developers("Anuj Dwivedi",102,45000);
		developer.detailsDisplay();
		
		Employees intern = new Interns("Utkarsh",103,5000);
		intern.detailsDisplay();

	}

}
