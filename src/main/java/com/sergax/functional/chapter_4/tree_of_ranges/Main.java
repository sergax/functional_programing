package com.sergax.functional.chapter_4.tree_of_ranges;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author : sergax
 * @date : 21.05.22
 */
public class Main {
    public static void main(String[] args) {
        Set<LongRange> numbers = new TreeSet<>(LongRange.getComparator());

        numbers.add(new LongRange(0, 5));
        numbers.add(new LongRange(2, 4));
        numbers.add(new LongRange(1, 4));
        numbers.add(new LongRange(1, 7));
        numbers.add(new LongRange(3, 5));

        numbers.forEach(System.out::println);
    }
}
