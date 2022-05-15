package com.sergax.functional.chapter_3.method_references.naive_task_manager;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * by Aksenchenko Serhii on 13.05.2022
 */

@Data
@AllArgsConstructor
class Task {
    private final long number;
    private final int priority;
}
