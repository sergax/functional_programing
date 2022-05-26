package com.sergax.functional.chapter_5.average_salary;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author : sergax
 * @date : 26.05.22
 */

@AllArgsConstructor
@Getter
public class Employee {
    private final String name;
    private final long salary;
}
