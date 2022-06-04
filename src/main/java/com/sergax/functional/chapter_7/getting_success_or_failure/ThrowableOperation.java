package com.sergax.functional.chapter_7.getting_success_or_failure;

/**
 * @author : sergax
 * @date : 04.06.22
 */
@FunctionalInterface
public interface ThrowableOperation<T> {
    T execute() throws Throwable;
}
