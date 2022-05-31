package com.sergax.functional.chapter_6.monitoring_user_activity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

/**
 * @author : sergax
 * @date : 31.05.22
 */

@AllArgsConstructor
@Getter
public class LogEntry {
    private final Date created;
    private final String login;
    private final String url;
}
