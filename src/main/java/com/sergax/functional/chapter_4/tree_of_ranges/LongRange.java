package com.sergax.functional.chapter_4.tree_of_ranges;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author : sergax
 * @date : 21.05.22
 */

@AllArgsConstructor
@Data
public class LongRange {
    private final long left;
    private final long right;

    public static Comparator<LongRange> getComparator() {
        // write your code here
        return Comparator.comparing(LongRange::hashCode);
    }
}
