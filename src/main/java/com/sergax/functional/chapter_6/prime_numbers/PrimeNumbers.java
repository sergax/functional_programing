package com.sergax.functional.chapter_6.prime_numbers;

import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author : sergax
 * @date : 31.05.22
 */

public class PrimeNumbers {
    public static LongStream createPrimesFilteringStream(long start, long end) {
        // write your code here
        return LongStream.rangeClosed(start, end)
                .parallel()
                .filter(NumberUtils::isPrime);
    }
}
