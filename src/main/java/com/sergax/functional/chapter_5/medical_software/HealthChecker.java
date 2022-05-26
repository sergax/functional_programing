package com.sergax.functional.chapter_5.medical_software;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author : sergax
 * @date : 26.05.22
 *
 *
 */

public class HealthChecker {
    public static boolean checkPulseMeasurements(List<Integer> pulseMeasurements) {
        return pulseMeasurements.stream()
                .allMatch(n -> n >= 90 && n <= 150); // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> measurements = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(checkPulseMeasurements(measurements));
    }
}
