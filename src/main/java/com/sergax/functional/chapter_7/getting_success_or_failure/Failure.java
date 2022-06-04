package com.sergax.functional.chapter_7.getting_success_or_failure;

import lombok.AllArgsConstructor;

import java.util.Optional;

/**
 * @author : sergax
 * @date : 04.06.22
 */
@AllArgsConstructor
public class Failure<T> implements Try<T> {
    private final Throwable e;

    @Override
    public T get() throws Throwable {
        // write your code here
        throw e;
    }

    @Override
    public T getUnchecked() {
        // write your code here
        throw new RuntimeException(e);
    }

    @Override
    public Optional<T> toOptional() {
        // write your code here
        return Optional.empty();
    }

    @Override
    public boolean isSuccess() {
        // write your code here
        return false;
    }

    @Override
    public String toString() {
        return "Failure[" + e + "]";
    }
}
