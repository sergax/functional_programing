package com.sergax.functional.chapter_6.cost_partitioning;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;

/**
 * @author : sergax
 * @date : 31.05.22
 *
 * Complete the getPartition method that produces two partitions: free applications and paid ones.
 * The partitions should be organized into a Map that contains free application by the true key and
 * paid ones by the false key.
 */

public class Partitioner {
    public static Map<Boolean, List<Application>> getPartition(List<Application> applicationList) {
        return applicationList.stream().collect(
                partitioningBy(Application::isFree)
        );
    }
}
