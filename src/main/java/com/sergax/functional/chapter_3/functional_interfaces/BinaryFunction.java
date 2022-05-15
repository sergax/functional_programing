package com.sergax.functional.chapter_3.functional_interfaces;

/**
 * by Aksenchenko Serhii on 29.03.2022
 * <p>
 * Your own binary function
 * Here you need to develop a functional interface that represents a binary function that
 * can accept two generic arguments and produce a generic result.
 * <p>
 * The order of the generic parameters must be the following: argument1, argument2, result.
 * The single abstract method of this interface must be named apply.
 * Don't forget about adding the special annotation for the interface.
 * Please, don't make the interface public, otherwise the platform testing system won't work.
 * <p>
 * Just for your information, there is a standard analogue of this interface called BiFunction
 */

@FunctionalInterface
interface BinaryFunction<A, B, R> {
    R apply(A argument1, B argument2);
}

