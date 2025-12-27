package com.constructor.levelone;

public class Circle {

    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Constructor chaining
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println("Area (default radius): " + c1.calculateArea());
        System.out.println("Area (radius 5): " + c2.calculateArea());
    }
}

