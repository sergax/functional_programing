package com.sergax.functional.chapter_6.prime_numbers;

import java.util.stream.LongStream;

/**
 * @author : sergax
 * @date : 31.05.22
 */

public class NumberUtils {
    public static boolean isPrime(long n) {
        return n > 1 && LongStream
                .rangeClosed(2, n - 1)
                .noneMatch(divisor -> n % divisor == 0);
    }
}
