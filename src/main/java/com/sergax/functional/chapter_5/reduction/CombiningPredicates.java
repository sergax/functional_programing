package com.sergax.functional.chapter_5.reduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : sergax
 * @date : 27.05.22
 *
 * Here, you need to implement the conjunctAll method that accepts a stream of IntPredicate objects and returns
 * one composed IntPredicate. This predicate must be a conjunction of all the input predicates, i.e. it returns true
 * only if the input predicates return true, otherwise it must be false.
 * If the input list is empty, the resulted predicate must return true for any integer value
 * (it is also known as always true predicate).
 */

public class CombiningPredicates {
    /**
     * The method represents the conjunction operator for a stream of predicates.
     * For an empty stream it returns the always true predicate.
     */
    public static IntPredicate conjunctAll(Stream<IntPredicate> predicates) {
        return predicates.reduce(IntPredicate::and).orElse(n -> true); // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split("\\s+");

        List<Boolean> values = Arrays.stream(strings)
                .map(Boolean::parseBoolean)
                .toList();

        List<IntPredicate> predicates = new ArrayList<>();
        values.forEach(v -> predicates.add(x -> v));

        System.out.println(conjunctAll(predicates.stream()).test(0));
    }
}
