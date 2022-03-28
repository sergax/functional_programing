package com.sergax.functional.lambda_expressions;

import java.util.function.BiFunction;

/**
 * by Aksenchenko Serhii on 29.03.2022
 *
 * The min of two numbers
 * Write a lambda expression that accepts two integer arguments and returns the minimum of them and then assign the lambda expression to the function variable. Don't forget to add the ; character on the end.
 *
 * Sample Input:
 *
 * 7 6
 * Sample Output:
 *
 * 6
 */
public class MinOfTwo {

    // assign a lambda expression to this variable
    static BiFunction<Integer, Integer, Integer> function = (x, y) ->
            x > y ? y : x;
}
