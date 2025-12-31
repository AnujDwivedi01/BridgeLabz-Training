package com.inheritance.assistedproblems.animal;

public class Cats extends Animals{
	public Cats(String name,int age) {
		super(name,age);// parent constructor
	}
	
	//method for make sound
	void makeSound() {
			System.out.println("Cat is Meowing");
		}
	
}
