package com.sergax.functional.chapter_5.processing_numbers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : sergax
 * @date : 25.05.22
 *
 * Here you need to use one of the methods learned in this lesson to implement the getStream
 * method that produces a stream containing sorted unique numbers that are strictly less than 100.
 *
 * As the problem is not difficult and it has several solutions, you can try to solve it several
 * times using different methods to consolidate your knowledge.
 */

public class ProcessingNumbers {
    public static Stream<Integer> getStream(Collection<Integer> numbers) {
        return numbers.stream().sorted(Comparator.reverseOrder())
                .dropWhile(n -> n >= 100)
                .distinct().sorted();
//        2nd solution :
//        numbers.stream().sorted().takeWhile(n -> n < 100).distinct();

        // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String result = getStream(numbers)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
