package com.sergax.functional.chapter_5.suspects;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : sergax
 * @date : 26.05.22
 */

public class Suspects {
    public static List<String> reduceSuspects(List<String> suspects) {
        return suspects.stream()
                .filter(n -> n.contains("jo"))
                .sorted().toList();
        // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> suspects = Stream
                .iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
                .map(i -> scanner.nextLine()).toList();

        reduceSuspects(suspects)
                .forEach(System.out::println);
    }
}
