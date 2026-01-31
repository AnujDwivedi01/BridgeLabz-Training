package com.collectors.studentsresultgrouping;

import java.util.*;
import java.util.stream.*;

public class StudentResultGrouping {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Anuj", "A"),
                new Student("Ravi", "B"),
                new Student("Neha", "A"),
                new Student("Pooja", "C"),
                new Student("Amit", "B")
        );

        Map<String, List<String>> groupedResult =
                students.stream()
                        .collect(Collectors.groupingBy(
                                s -> s.grade,
                                Collectors.mapping(s -> s.name, Collectors.toList())
                        ));

        System.out.println(groupedResult);
    }
}
