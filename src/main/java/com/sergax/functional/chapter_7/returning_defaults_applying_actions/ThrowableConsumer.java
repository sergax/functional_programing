package com.sergax.functional.chapter_7.returning_defaults_applying_actions;

/**
 * @author : sergax
 * @date : 04.06.22
 */
@FunctionalInterface
public interface ThrowableConsumer<T, E extends Throwable>  {
    void accept(T t) throws E;
}
