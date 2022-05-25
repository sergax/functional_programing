package com.sergax.functional.chapter_5.find_max_number;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author : sergax
 * @date : 25.05.22
 *
 * You need to implement the findMaxEvenNumber method to find the maximum number that is divisible by 2 (even).
 * The method should return the found number or 0 if the stream doesn't contain any even numbers.
 */

public class MaxEvenNumber {
    public static int findMaxEvenNumber(Collection<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compare)
                .orElse(0); // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        System.out.println(findMaxEvenNumber(numbers));
    }
}
