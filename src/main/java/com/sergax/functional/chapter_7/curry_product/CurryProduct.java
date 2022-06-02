package com.sergax.functional.chapter_7.curry_product;

import java.util.function.IntFunction;

/**
 * @author : sergax
 * @date : 02.06.22
 * <p>
 * Write a curried form of the function f(x, y, z) = x + y^2 + z^3.
 * The result and the arguments x, y, z must be integer numbers.
 * Note, that the ^ characters means the pow operation.
 * Solution format. It is allowed to write the result in any valid formats but with ; on the end.
 */
public class CurryProduct {
    public static int calc(int x, int y, int z) {

        IntFunction<IntFunction<IntFunction<Integer>>> f =
                a -> b -> c -> a + b * b + z * z * z;

        // write your code here

        return f.apply(x).apply(y).apply(z);
    }
}
