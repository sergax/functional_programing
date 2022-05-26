package com.sergax.functional.chapter_5.suspects;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author : sergax
 * @date : 26.05.22
 *
 * Recently there was a high-profile crime in a city. Police found a criminal's torn business card which
 * has "jo" written on it. Detectives suspect that this is a part of the criminal's first or last name.
 *
 * You need to write some code to reduce the number of suspects according to this clue to make the crime
 * investigation much easier. In the resulting list, the suspects must be sorted alphabetically according to their names.
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
