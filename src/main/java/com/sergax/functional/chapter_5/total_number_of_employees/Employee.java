package com.sergax.functional.chapter_5.total_number_of_employees;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

/**
 * @author : sergax
 * @date : 26.05.22
 */

@AllArgsConstructor
@Getter
@ToString
public class Employee {
    private final String name;
    private final Long salary;
}
