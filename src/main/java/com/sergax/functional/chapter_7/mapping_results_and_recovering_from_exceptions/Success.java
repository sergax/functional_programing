package com.sergax.functional.chapter_7.mapping_results_and_recovering_from_exceptions;

import lombok.AllArgsConstructor;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author : sergax
 * @date : 04.06.22
 */
@AllArgsConstructor
public class Success<T> implements Try<T> {
    private final T value;

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
    public <U> Try<U> map(ThrowableFunction<? super T, ? extends U> function) {
        return Try.of(() -> function.apply(value));
    }

    @Override
    public <U> Try<U> flatMap(ThrowableFunction<? super T, Try<U>> function) {
        return Try.of(() -> function.apply(value).getOrElseThrow(Exception::new));
    }

    @Override
    public Try<T> recover(ThrowableFunction<? super Throwable, T> function) {
        return this;
    }

    @Override
    public Try<T> recoverWith(ThrowableFunction<? super Throwable, Try<T>> function) {
        return this;
    }

    @Override
    public String toString() {
        return "Success[" + value + "]";
    }
}
