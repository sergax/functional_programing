package com.sergax.functional.chapter_7.adding_extensions;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author : sergax
 * @date : 02.06.22
 *
 * Implement the addExtension method that accepts two string predicates and returns a function.
 * The returning function should accept one argument and return the argument with
 * .xml suffix if the argument matches the first predicate,
 * .json suffix if the argument matches the second predicate, and the argument itself otherwise.
 */

class ExtensionService {
    public static Function<String, String> addExtension(Predicate<String> xml, Predicate<String> json) {

       return file ->
               file + ((xml.test(file)) ? ".xml" : json.test(file) ? ".json" : "");
        // write your code here
    }
}
