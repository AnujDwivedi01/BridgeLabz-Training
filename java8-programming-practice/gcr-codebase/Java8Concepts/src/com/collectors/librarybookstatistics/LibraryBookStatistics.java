package com.collectors.librarybookstatistics;

import java.util.*;
import java.util.stream.*;

public class LibraryBookStatistics {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Java Basics", "Programming", 300),
                new Book("Spring Boot", "Programming", 450),
                new Book("Clean Code", "Programming", 400),
                new Book("Harry Potter", "Fantasy", 350),
                new Book("Hobbit", "Fantasy", 280),
                new Book("Finance 101", "Business", 220)
        );

        Map<String, IntSummaryStatistics> statsByGenre =
                books.stream()
                        .collect(Collectors.groupingBy(
                                Book::getGenre,
                                Collectors.summarizingInt(Book::getPages)
                        ));

        statsByGenre.forEach((genre, stats) -> {
            System.out.println(
                    genre +
                    " -> Total: " + stats.getSum() +
                    ", Avg: " + stats.getAverage() +
                    ", Max: " + stats.getMax()
            );
        });
    }
}