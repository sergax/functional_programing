package com.sergax.functional.chapter_3.method_references.retrying_actions;

import java.util.function.Function;

/**
 * by Aksenchenko Serhii on 12.05.2022
 */
public class Class {
    public static void main(String[] args) {
        Function<String, Integer> parser = Integer::parseInt;

        int i = parser.apply("123");
//        int j = parser.apply("acv");

        System.out.println(i);
       // System.out.println(j);
    }
}
