package com.sergax.functional.chapter_5.java_events;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : sergax
 * @date : 25.05.22
 */

public class SearchJavaEvents {
    public static void printSortedJavaEvents(List<String> events) {
        // write your code here
        events.stream()
                .filter(n -> n.toLowerCase().contains("j"))
                .sorted()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> events = Stream
                .iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
                .map(i -> scanner.nextLine()).toList();

        printSortedJavaEvents(events);
    }
}
