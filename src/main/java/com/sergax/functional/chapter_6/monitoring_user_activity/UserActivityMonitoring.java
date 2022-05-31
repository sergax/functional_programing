package com.sergax.functional.chapter_6.monitoring_user_activity;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

/**
 * @author : sergax
 * @date : 31.05.22
 */
public class UserActivityMonitoring {
    public static Map<String, Long> getUrlToNumberOfVisited(List<LogEntry> logs) {
        return logs.stream()
                .collect(Collectors.groupingBy(LogEntry::getUrl, counting()));
        // write your code here
    }
}
