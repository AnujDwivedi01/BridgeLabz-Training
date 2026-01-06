package com.petpalapp;

import java.util.Scanner;
public class PetPalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pet pet = null;

        System.out.println("=== Welcome to PetPal ===");
        System.out.print("Enter Pet Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Pet Age: ");
        int age = sc.nextInt();

        System.out.println("\nChoose Pet Type:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        // Polymorphism
        switch (choice) {
            case 1:
                pet = new Dog(name, age);
                break;
            case 2:
                pet = new Cat(name, age);
                break;
            case 3:
                pet = new Bird(name, age);
                break;
            default:
                System.out.println("Invalid pet type.");
                sc.close();
                return;
        }

        int option;
        do {
            System.out.println("\n--- Pet Actions ---");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Make Sound");
            System.out.println("5. View Status");
            System.out.println("6. Exit");
            System.out.print("Enter option: ");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.play();
                    break;
                case 3:
                    pet.sleep();
                    break;
                case 4:
                    pet.makeSound();
                    break;
                case 5:
                    pet.displayStatus();
                    break;
                case 6:
                    System.out.println("Goodbye from PetPal!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 6);

        sc.close();
    }
}