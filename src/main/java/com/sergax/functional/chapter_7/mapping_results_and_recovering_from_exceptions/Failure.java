package com.sergax.functional.chapter_7.mapping_results_and_recovering_from_exceptions;

import lombok.AllArgsConstructor;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author : sergax
 * @date : 04.06.22
 */
@AllArgsConstructor
public class Failure<T> implements Try<T> {
    private final Throwable e;

    @Override
    public boolean isSuccess() {
        return false;
    }

    @Override
    public T get() throws Throwable {
        throw e;
    }

    @Override
    public T getUnchecked() {
        throw new RuntimeException(e);
    }

    @Override
    public Optional<T> toOptional() {
        return Optional.empty();
    }

    @Override
    public T getOrElse(T defaultValue) {
        return defaultValue;
    }

    @Override
    public T getOrElseSupply(Supplier<? extends T> supplier) {
        return supplier.get();
    }

    @Override
    public <X extends Throwable> T getOrElseThrow(Supplier<? extends X> exceptionSupplier) throws X {
        throw exceptionSupplier.get();
    }

    @Override
    public <E extends Throwable> Try<T> onSuccess(ThrowableConsumer<T, E> action) throws E {
        return this;
    }

    @Override
    public <E extends Throwable> Try<T> onFailure(ThrowableConsumer<Throwable, E> action) throws E {
        action.accept(e);
        return this;
    }

    @Override
    public Try<T> filter(Predicate<T> predicate) {
        return this;
    }

    @Override
    public <U> Try<U> map(ThrowableFunction<? super T, ? extends U> function) {
        return new Failure<>(e);
    }

    @Override
    public <U> Try<U> flatMap(ThrowableFunction<? super T, Try<U>> function) {
        return new Failure<>(e);
    }

    @Override
    public Try<T> recover(ThrowableFunction<? super Throwable, T> function) {
        return Try.of(() -> function.apply(e));
    }

    @Override
    public Try<T> recoverWith(ThrowableFunction<? super Throwable, Try<T>> function) {
        return Try.of(() -> function.apply(e).getOrElseThrow(Exception::new));
    }

    @Override
    public String toString() {
        return "Failure[" + e + "]";
    }
}
