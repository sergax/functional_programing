package com.sergax.functional.chapter_5.printing_the_first_suitable_word;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author : sergax
 * @date : 26.05.22
 *
 * Here you need to implement a method named printFirstWordWithoutPrefix that takes a list of words and a prefix
 * and prints the first word that doesn't start from the prefix. If the suitable word is not found, the method
 * shouldn't print anything.
 */


public class FirstWordWithoutPrefix {
    public static void printFirstWordWithoutPrefix(List<String> words, String prefix) {
        words.stream()
                .filter(n -> !n.contains(prefix))
                .findFirst()
                .ifPresent(System.out::println);
        // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays
                .stream(scanner.nextLine().split("\\s+")).toList();

        String prefix = scanner.nextLine();

        printFirstWordWithoutPrefix(words, prefix);
    }
}
