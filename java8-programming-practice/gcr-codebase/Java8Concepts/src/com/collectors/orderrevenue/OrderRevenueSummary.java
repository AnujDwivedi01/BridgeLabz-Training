package com.collectors.orderrevenue;
import java.util.*;
import java.util.stream.*;


public class OrderRevenueSummary {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Anuj", 1200.50),
                new Order("Ravi", 800.00),
                new Order("Anuj", 450.75),
                new Order("Ravi", 200.25),
                new Order("Meena", 1500.00)
        );

        Map<String, Double> revenueByCustomer =
                orders.stream()
                        .collect(Collectors.groupingBy(
                                o -> o.customer,
                                Collectors.summingDouble(o -> o.amount)
                        ));

        System.out.println(revenueByCustomer);
    }
}