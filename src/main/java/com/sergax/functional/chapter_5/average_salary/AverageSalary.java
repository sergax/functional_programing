package com.sergax.functional.chapter_5.average_salary;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : sergax
 * @date : 26.05.22
 */

public class AverageSalary {
    public static double averageSalary(List<Employee> employees) {
        return employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = Stream
                .iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
                .map(i -> scanner.nextLine().split("\\s+"))
                .map(parts -> new Employee(parts[0], Long.parseLong(parts[1]))).toList();

        System.out.println(averageSalary(employees));
    }
}
