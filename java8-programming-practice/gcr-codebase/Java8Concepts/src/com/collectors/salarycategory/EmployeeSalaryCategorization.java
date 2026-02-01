package com.collectors.salarycategory;

import java.util.*;
import java.util.stream.*;

public class EmployeeSalaryCategorization {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Anuj", "IT", 60000),
                new Employee("Ravi", "HR", 45000),
                new Employee("Meena", "IT", 75000),
                new Employee("Sita", "Finance", 50000),
                new Employee("Aman", "HR", 55000)
        );

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

        System.out.println(avgSalaryByDept);
    }
}