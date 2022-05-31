package com.sergax.functional.chapter_6.average_monthly_salary;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author : sergax
 * @date : 31.05.22
 *
 * Imagine that you need to calculate the average monthly salary in a company. For that purpose,
 * you need to implement the calcAverageSalary method that takes a list of salaries and calculates the value.
 * You don't need to round the result here.
 */

public class CalculateAverageSalary {
    private static double calcAverageSalary(Collection<Integer> salaries) {
        return salaries.stream().mapToDouble(n -> n).average().getAsDouble();
        // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> salaries = scanner.tokens()
                .map(Integer::parseInt)
                .toList();

        System.out.println(calcAverageSalary(salaries));
    }
}
