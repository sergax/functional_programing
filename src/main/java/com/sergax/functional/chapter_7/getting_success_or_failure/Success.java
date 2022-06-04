package com.sergax.functional.chapter_7.getting_success_or_failure;

import lombok.AllArgsConstructor;

import java.util.Optional;

/**
 * @author : sergax
 * @date : 04.06.22
 */
@AllArgsConstructor
public class Success<T> implements Try<T> {
    private final T value;

    @Override
    public T get() {
        // write your code here
        return value;
    }

    @Override
    public T getUnchecked() {
        // write your code here
        return value;
    }

    @Override
    public Optional<T> toOptional() {
        // write your code here
        return Optional.of(value);
    }

    @Override
    public boolean isSuccess() {
        // write your code here
        return true;
    }

    @Override
    public String toString() {
        return "Success[" + value + "]";
    }
}
