package com.sergax.functional.chapter_6.grouping_words;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author : sergax
 * @date : 31.05.22
 *
 * In this exercise, you need to implement a function that accepts a list of words and groups them by their length.
 */

public class Classifier {
    public static Map<Integer, List<String>> group(List<String> words) {
        return words.stream().collect(
                Collectors.groupingBy(String::length)
        );
    }
}
