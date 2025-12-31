package com.inheritance.assistedproblems;

class Animal{
	//instance variable
	protected String name;
	protected int age;
	
	//constructor
	
	Animal(String name,int age){
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

class Dog extends Animal{
	
	public Dog(String name,int age) {
		super(name,age);// parent constructor
	}
	
	//method for make sound
	void makeSound() {
			System.out.println("Dog id Barking");
		}
}

class Cat extends Animal{
	public Cat(String name,int age) {
		super(name,age);// parent constructor
	}
	
	//method for make sound
	void makeSound() {
			System.out.println("Cat is Meowing");
		}
	
}

class Bird extends Animal{
	public Bird(String name,int age) {
		super(name,age);// parent constructor
	}
	
	//method for make sound
	void makeSound() {
			System.out.println("Bird is chirping");
		}
	
}

public class AnimalHierarchy {

	public static void main(String[] args) {
		
           Animal dog = new Dog("German Shephered", 20);
           dog.makeSound();
           dog.details();
           
           Animal cat = new Cat("Soofy",8);
           cat.makeSound();
           cat.details();
           
           Animal bird = new Bird("Crow",7);
           bird.makeSound();
           bird.details();
	}

}
