package com.sergax.functional.chapter_5.inflation_problem;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author : sergax
 * @date : 28.05.22
 */

class InflationProblem {
    public static long calculateTotalPriceInFuture(int numberOfYears, List<Grocery> groceries) {
        return groceries.stream()
                .map(grocery -> grocery.getCost() * (long) Math.pow(times(grocery), numberOfYears))
                .reduce(0L, Long::sum);
        // write your code here
    }

    private static int times(Grocery grocery) {
       return switch (grocery.getCategory()) {
           case VEGETABLES -> 3;
            case FRUITS -> 4;
            case DAIRY -> 2;
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfYears = Integer.parseInt(scanner.nextLine());

        List<Grocery> groceries = Stream.iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
                .map(i -> scanner.nextLine())
                .map(inputLine -> {
                    String[] parts = inputLine.split("\\s+");
                    return new Grocery(Long.parseLong(parts[0]), Category.valueOf(parts[1]));
                })
                .toList();

        long totalPriceInFuture = calculateTotalPriceInFuture(numberOfYears, groceries);

        System.out.println(totalPriceInFuture);
    }
}
