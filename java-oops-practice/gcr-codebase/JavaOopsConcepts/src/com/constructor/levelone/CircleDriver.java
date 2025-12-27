package com.constructor.levelone;

public class CircleDriver {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println("Area (default radius): " + c1.calculateArea());
        System.out.println("Area (radius 5): " + c2.calculateArea());
    }
}
