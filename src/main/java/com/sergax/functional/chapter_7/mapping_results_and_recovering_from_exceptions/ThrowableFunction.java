package com.sergax.functional.chapter_7.mapping_results_and_recovering_from_exceptions;

/**
 * @author : sergax
 * @date : 04.06.22
 */
@FunctionalInterface
public interface ThrowableFunction<T, R> {
    R apply(T t) throws Throwable;
}
