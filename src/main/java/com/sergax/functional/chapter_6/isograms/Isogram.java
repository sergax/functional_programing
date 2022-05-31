package com.sergax.functional.chapter_6.isograms;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author : sergax
 * @date : 31.05.22
 *
 * Here, you need to implement a method to check if the given word is an
 * isogram that means that no letter of the alphabet occurs more than once in this word, consecutive or non-consecutive.
 *
 * To make it easier to come up with a stream-based solution, we give you a hint: the number
 * of unique characters in an isogram word is the same as the length of this word.
 */

public class Isogram {
    public static boolean isIsogram(String word) {
        return word.chars().distinct().count() == word.length();
        // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        System.out.println(isIsogram(word));
    }

}
