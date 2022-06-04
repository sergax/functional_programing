package com.sergax.functional.chapter_7.returning_defaults_applying_actions;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author : sergax
 * @date : 04.06.22
 */
public class Success<T> implements Try<T> {
    private final T value;

    Success(T value) {
        this.value = value;
    }

    @Override
    public boolean isSuccess() {
        return true;
    }

    @Override
    public T get() throws Throwable {
        return value;
    }

    @Override
    public T getUnchecked() {
        return value;
    }

    @Override
    public Optional<T> toOptional() {
        return Optional.of(value);
    }

    @Override
    public T getOrElse(T defaultValue) {
        return value;
    }

    @Override
    public T getOrElseSupply(Supplier<? extends T> supplier) {
        return value;
    }

    @Override
    public <X extends Throwable> T getOrElseThrow(Supplier<? extends X> exceptionSupplier) throws X {
        return value;
    }

    @Override
    public <E extends Throwable> Try<T> onSuccess(ThrowableConsumer<T, E> action) throws E {
        action.accept(value);
        return this;
    }

    @Override
    public <E extends Throwable> Try<T> onFailure(ThrowableConsumer<Throwable, E> action) throws E {
        return this;
    }

    @Override
    public Try<T> filter(Predicate<T> predicate) {
        if (predicate.test(value))
            return this;
        else
            return new Failure<>(new NoSuchElementException());
    }

    @Override
    public String toString() {
        return "Success[" + value + "]";
    }
}
