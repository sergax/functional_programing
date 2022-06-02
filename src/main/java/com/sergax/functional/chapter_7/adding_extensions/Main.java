package com.sergax.functional.chapter_7.adding_extensions;

import java.util.function.Function;

import static com.sergax.functional.chapter_7.adding_extensions.ExtensionService.addExtension;

/**
 * @author : sergax
 * @date : 02.06.22
 */

public class Main {
    public static void main(String[] args) {
        Function<String, String> func = addExtension(y->y.equals("First"), y->y.equals("Second"));
        System.out.println(func.apply("First"));//should print First.xml
        System.out.println(func.apply("Second"));//should print Second.json
        System.out.println(func.apply("Otherwise"));//should print Otherwise
    }
}
