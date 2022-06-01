package com.sergax.functional.chapter_6.chain_of_responsebility;

import java.util.function.Predicate;

/**
 * @author : sergax
 * @date : 01.06.22
 *
 * Let's consider developing a code linter as an example (linter is a tool for automated checking of your source
 * code for programmatic and stylistic errors). To lint or validate the code, you have to analyze it.
 * You decided to start easy: analyze a single code statement and determine if it's valid.
 * The validation can be done step by step:
 *
 * Check if the statement has the ; symbol at the end.
 * Check if the length of the statement is less than 50 symbols.
 * Check if the statement does not contain the forbidden val word.
 */
public class Client {
    public static void main(String[] args) {
        String s = "Chain chain = new Chain();";

        Predicate<String> lineEndHandler = statement -> statement.endsWith(";");
        Predicate<String> lengthHandler = statement -> statement.length() <= 50;
        Predicate<String> valHandler = statement -> !statement.contains("val");

        boolean isValid = lineEndHandler
                .and(lengthHandler)
                .and(valHandler)
                .test(s);

        System.out.println(isValid);
    }
}
