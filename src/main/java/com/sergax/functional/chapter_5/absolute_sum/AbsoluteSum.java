package com.sergax.functional.chapter_5.absolute_sum;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author : sergax
 * @date : 27.05.22
 * <p>
 * Here you need to implement the sumOfAbsoluteNumbers method to calculate the sum of long numbers regardless their sign.
 * Pay attention that here you work with the long type.
 */

public class AbsoluteSum {
    public static long sumOfAbsoluteNumbers(Collection<Long> numbers) {
        return numbers.stream()
                .map(Math::abs)
                .reduce(Long::sum).get();
        // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<Long> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Long::parseLong)
                .collect(Collectors.toList());

        System.out.println(sumOfAbsoluteNumbers(numbers));
    }
}
