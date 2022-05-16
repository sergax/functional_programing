package com.sergax.functional.chapter_3.composition_of_functions.xor;

import java.util.function.Predicate;

/**
 * by Aksenchenko Serhii on 15.05.2022
 *
 * In this task you need to create the xor operation using all of and, or and not. There are several ways how to get it
 * but the simplest one is just to follow the formula: A or B, but not(A and B).
 */
public class XorPredicate {
    public static <T> Predicate<T> xor(Predicate<T> predicate1, Predicate<T> predicate2) {
        return predicate1.and(predicate2).negate().and(predicate1.or(predicate2));  // write your code here
    }
}
