package com.sergax.functional.chapter_5.countries;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author : sergax
 * @date : 26.05.22
 */

@AllArgsConstructor
@Getter
public class Country {
    private final String name;
    private final int population;
}
