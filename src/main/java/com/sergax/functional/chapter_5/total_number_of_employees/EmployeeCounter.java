package com.sergax.functional.chapter_5.total_number_of_employees;

import java.util.List;

/**
 * @author : sergax
 * @date : 26.05.22
 *
 * Your task is to implement a method that calculates the total number of employees with salary >= threshold for
 * all departments whose code starts with the string "111-" (without ""). Try to apply your knowledge of the Stream
 * API and especially the flatMap method to provide the implementation.
 */

public class EmployeeCounter {
    private final static String CODE_STARTS = "111-1";

    public static void main(String[] args) {
        List<Department> departments = List.of(
                new Department("dep-1", "111-1", List.of(
                        new Employee("William", 15000L),
                        new Employee("Sophia", 22000L),
                        new Employee("John", 20000L)
                )),
                new Department("dep-2", "222-1", List.of(
                        new Employee("Victor", 25000L)
                ))
        );
        System.out.println(calcNumberOfEmployees(departments, 20_000L));
    }
    /**
     * Calculates the number of employees with salary >= threshold (only for 111- departments)
     *
     * @param departments are list of departments
     * @param threshold is lower edge of salary
     *
     * @return the number of employees
     */
    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        return departments.stream()
                .filter(department -> department.getCode().contains(CODE_STARTS))
                .flatMap(department -> department.getEmployees().stream())
                .filter(employee -> employee.getSalary() >= threshold).count();
        // write your code here
    }
}
