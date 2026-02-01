package com.collectors.studentwordfreq;


import java.util.*;
import java.util.stream.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        String text = "java is easy and java is powerful and java is fun";

        Map<String, Integer> wordCount =
                Arrays.stream(text.toLowerCase().split("\\s+"))
                        .collect(Collectors.toMap(
                                w -> w,
                                w -> 1,
                                Integer::sum
                        ));

        System.out.println(wordCount);
    }
}
