package com.inheritance.assistedproblems.animal;

public class Animals{
	//instance variable
	protected String name;
	protected int age;
	
	//constructor
	
	public Animals(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	//method for make sound
	void makeSound() {
		System.out.println("Animal makes sound");
	}
	
	// method to view details
	
	void details() {
		System.out.println("The name of Animal "+this.name);
		System.out.println("Age of "+this.name+" is "+ this.age);
	}
	
	
	
}
