package com.sergax.functional.chapter_3.lambda_expressions.replacing_digits;

import java.util.function.Function;

/**
 * by Aksenchenko Serhii on 29.03.2022
 */
public class Utils {
    public static int substitution(long n, Function<Integer, Integer> digitRule) {
        String numberAsString = String.valueOf(n);
        int result = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            result *= 10;
            int nextDigit = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
            result += digitRule.apply(nextDigit);
        }
        return result;
    }
}
