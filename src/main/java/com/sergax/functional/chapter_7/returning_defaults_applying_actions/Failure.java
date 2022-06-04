package com.sergax.functional.chapter_7.returning_defaults_applying_actions;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author : sergax
 * @date : 04.06.22
 */
public class Failure<T> implements Try<T> {
    private final Throwable e;

    Failure(Throwable e) {
        this.e = e;
    }

    @Override
    public boolean isSuccess() {
        // take it from the previous step
        return false;
    }

    @Override
    public T get() throws Throwable {
        // take it from the previous step
        throw e;
    }

    @Override
    public T getUnchecked() {
        // take it from the previous step
        throw new RuntimeException(e);
    }

    @Override
    public Optional<T> toOptional() {
        // take it from the previous step
        return Optional.empty();
    }

    @Override
    public T getOrElse(T defaultValue) {
        // write your code here
        return defaultValue;
    }

    @Override
    public T getOrElseSupply(Supplier<? extends T> supplier) {
        // write your code here
        return supplier.get();
    }

    @Override
    public <X extends Throwable> T getOrElseThrow(Supplier<? extends X> exceptionSupplier) throws X {
        // write your code here
        throw exceptionSupplier.get();
    }

    @Override
    public <E extends Throwable> Try<T> onSuccess(ThrowableConsumer<T, E> action) {
        // write your code here
        return this;
    }

    @Override
    public <E extends Throwable> Try<T> onFailure(ThrowableConsumer<Throwable, E> action) throws E {
        // write your code here
        action.accept(e);
        return this;
    }

    @Override
    public Try<T> filter(Predicate<T> predicate) {
        // write your code here
        return new Failure<>(e);
    }

    @Override
    public String toString() {
        return "Failure[" + e + "]";
    }
}
