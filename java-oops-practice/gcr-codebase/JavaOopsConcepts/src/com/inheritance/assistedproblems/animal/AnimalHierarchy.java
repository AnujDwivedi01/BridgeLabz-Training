package com.inheritance.assistedproblems.animal;


public class AnimalHierarchy {

	public static void main(String[] args) {
		
           Animals dog = new Dogs("German Shephered", 20);
           dog.makeSound();
           dog.details();
           
           Animals cat = new Cats("Soofy",8);
           cat.makeSound();
           cat.details();
           
           Animals bird = new Birds("Crow",7);
           bird.makeSound();
           bird.details();
	}

}
