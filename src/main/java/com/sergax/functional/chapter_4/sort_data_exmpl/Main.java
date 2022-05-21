package com.sergax.functional.chapter_4.sort_data_exmpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author : sergax
 * @date : 21.05.22
 */
public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("HP", 4, 15.6);
        Laptop laptop2 = new Laptop("ASUS", 2, 16.1);
        Laptop laptop3 = new Laptop("Dell", 6, 17.0);
        Laptop laptop4 = new Laptop("Apple", 4, 15.1);

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);

        List<String> w = new ArrayList<>();

        w.sort(Comparator.comparing(String::length));
        laptops.sort(CompareOfLaptop.compareByCores());
        laptops.forEach(System.out::println);
    }
}
