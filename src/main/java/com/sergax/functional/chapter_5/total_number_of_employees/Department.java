package com.sergax.functional.chapter_5.total_number_of_employees;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * @author : sergax
 * @date : 26.05.22
 */

@AllArgsConstructor
@Getter
@ToString
public class Department {
    private final String name;
    private final String code;
    private final List<Employee> employees;
}
