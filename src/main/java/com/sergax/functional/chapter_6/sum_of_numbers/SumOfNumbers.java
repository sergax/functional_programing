package com.sergax.functional.chapter_6.sum_of_numbers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : sergax
 * @date : 31.05.22
 *
 * The task here is pretty simple. You need to implement the sum method that calculates the sum of the given array of long's.
 *
 * Please, use a primitive type stream to solve this task.
 */
public class SumOfNumbers {
    public static long sum(long[] numbers) {
        return Arrays.stream(numbers).sum(); // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToLong(Long::parseLong)
                .toArray();

        System.out.println(sum(numbers));
    }
}
