package com.sergax.functional.chapter_5.inflation_problem;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author : sergax
 * @date : 28.05.22
 */

@AllArgsConstructor
@Getter
class Grocery {
    private final long cost;
    private final Category category;
}
