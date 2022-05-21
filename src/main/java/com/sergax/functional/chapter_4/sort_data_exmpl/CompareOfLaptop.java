package com.sergax.functional.chapter_4.sort_data_exmpl;

import java.util.Comparator;

/**
 * @author : sergax
 * @date : 21.05.22
 */

public class CompareOfLaptop {
    static Comparator<Laptop> compareByCores () {
        return Comparator.comparing(Laptop::getNumberOfCores);
    }
}
