package com.inheritance.assistedproblems.animal;

public class Birds extends Animals{
	public Birds(String name,int age) {
		super(name,age);// parent constructor
	}
	
	//method for make sound
	void makeSound() {
			System.out.println("Bird is chirping");
		}
	
}
