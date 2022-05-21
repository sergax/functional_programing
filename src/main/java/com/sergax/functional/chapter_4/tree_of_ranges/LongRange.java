package com.sergax.functional.chapter_4.tree_of_ranges;

import com.sergax.functional.chapter_4.sort_data_exmpl.Laptop;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author : sergax
 * @date : 21.05.22
 *
 * The objects will be sorted according to the following rules:
 *
 * If one range is longer than others, then it is the larger in the sorting order.
 * If several ranges have the same length, the smaller is the one with the smaller left border.
 * The sorting goes in the ascending order.
 */

@AllArgsConstructor
@Data
public class LongRange {
    private final long left;
    private final long right;

    public static Comparator<LongRange> getComparator() {
        // write your code here
        return Comparator
                .comparing((LongRange range) -> Math.abs(range.right) - range.left)
                .thenComparing(LongRange::getLeft);
    }
}
