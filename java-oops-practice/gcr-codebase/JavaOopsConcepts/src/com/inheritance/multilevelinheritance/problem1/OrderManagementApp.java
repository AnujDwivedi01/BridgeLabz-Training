package com.inheritance.multilevelinheritance.problem1;

public class OrderManagementApp {

    public static void main(String[] args) {

        Order order = new Order(101, "01-01-2025");
        ShippedOrder shippedOrder =
                new ShippedOrder(102, "02-01-2025", "TRK12345");
        DeliveredOrder deliveredOrder =
                new DeliveredOrder(103, "03-01-2025", "TRK67890", "05-01-2025");

        System.out.println("Order 1 Status: " + order.getOrderStatus());
        System.out.println("Order 2 Status: " + shippedOrder.getOrderStatus());
        System.out.println("Order 3 Status: " + deliveredOrder.getOrderStatus());
    }
}
