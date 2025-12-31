package com.inheritance.assistedproblems.animal;

public class Dogs extends Animals{
	
	public Dogs(String name,int age) {
		super(name,age);// parent constructor
	}
	
	//method for make sound
	void makeSound() {
			System.out.println("Dog id Barking");
		}
}
