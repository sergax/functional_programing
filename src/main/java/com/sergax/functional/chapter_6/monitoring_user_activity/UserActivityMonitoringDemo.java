package com.sergax.functional.chapter_6.monitoring_user_activity;

import java.util.*;

import static java.util.stream.Collectors.toList;

/**
 * @author : sergax
 * @date : 31.05.22
 */
public class UserActivityMonitoringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLogEntries = Integer.parseInt(scanner.nextLine());

        List<LogEntry> logs = new ArrayList<>();
        for (int i = 0; i < numberOfLogEntries; i++) {
            String[] info = scanner.nextLine().split(" ");

            Date dt = new Date();
            String user = info[0];
            String url = info[1];

            logs.add(new LogEntry(dt, user, url));
        }

        List<Map.Entry<String, Long>> result = UserActivityMonitoring.getUrlToNumberOfVisited(logs)
                .entrySet()
                .stream()
                .sorted((w1, w2) -> w2.getValue().compareTo(w1.getValue()))
                .toList();

        StringBuilder resultString = new StringBuilder();
        for (Map.Entry<String, Long> entry : result) {
            resultString.append(entry.getKey())
                    .append("=")
                    .append(entry.getValue())
                    .append(" ");
        }

        System.out.println(resultString.toString().trim());
    }
}
