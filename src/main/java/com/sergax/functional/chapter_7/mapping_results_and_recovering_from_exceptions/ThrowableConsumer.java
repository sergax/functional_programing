package com.sergax.functional.chapter_7.mapping_results_and_recovering_from_exceptions;

/**
 * @author : sergax
 * @date : 04.06.22
 */
@FunctionalInterface
public interface ThrowableConsumer<T, E extends Throwable> {
    void accept(T t) throws E;
}
