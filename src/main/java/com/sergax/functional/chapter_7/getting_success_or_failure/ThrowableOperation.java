package com.sergax.functional.chapter_7.getting_success_or_failure;

/**
 * @author : sergax
 * @date : 04.06.22
 *
 * Represents an operation that may potentially fail with an exception
 */
@FunctionalInterface
public interface ThrowableOperation<T> {
    T execute() throws Throwable;
}
