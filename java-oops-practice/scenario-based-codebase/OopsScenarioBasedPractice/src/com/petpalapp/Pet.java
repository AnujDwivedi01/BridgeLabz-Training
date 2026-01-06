package com.petpalapp;
import java.util.Random;
abstract class Pet implements IInteractable {
    protected String name;
    protected String type;
    protected int age;

    private int hunger;
    private int mood;
    private int energy;

    // Constructor with random default values
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random r = new Random();
        this.hunger = r.nextInt(50) + 30;   // 30–80
        this.mood = r.nextInt(50) + 30;
        this.energy = r.nextInt(50) + 30;
    }

    // Constructor with user-defined values
    public Pet(String name, String type, int age, int hunger, int mood, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.mood = mood;
        this.energy = energy;
    }

    @Override
    public void feed() {
        hunger -= 20;
        energy += 10;
        mood += 10;
        normalize();
        System.out.println(name + " has been fed.");
    }

    @Override
    public void play() {
        hunger += 15;
        energy -= 20;
        mood += 20;
        normalize();
        System.out.println(name + " enjoyed playing.");
    }

    @Override
    public void sleep() {
        energy += 30;
        hunger += 10;
        mood += 5;
        normalize();
        System.out.println(name + " is sleeping.");
    }

    // Polymorphic method
    public abstract void makeSound();

    // Normalize values between 0–100
    private void normalize() {
        hunger = Math.max(0, Math.min(100, hunger));
        mood = Math.max(0, Math.min(100, mood));
        energy = Math.max(0, Math.min(100, energy));
    }

    public void displayStatus() {
        System.out.println("\nPet Status:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
        System.out.println("Hunger: " + hunger);
        System.out.println("Mood: " + mood);
        System.out.println("Energy: " + energy);
    }
}