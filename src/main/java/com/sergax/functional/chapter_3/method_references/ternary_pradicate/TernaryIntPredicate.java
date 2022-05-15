
package com.sergax.functional.chapter_3.method_references.ternary_pradicate;

import java.util.stream.Stream;

/**
 * by Aksenchenko Serhii on 14.05.2022
 */

@FunctionalInterface
public interface TernaryIntPredicate {
    public boolean test(int i, int j, int p);

    TernaryIntPredicate allValuesAreDifferentPredicate =
            (i, j, p) ->
                    Stream.of(i, j, p)
                            .distinct()
                            .count() == 3;

}







