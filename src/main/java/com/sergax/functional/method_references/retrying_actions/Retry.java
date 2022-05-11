package com.sergax.functional.method_references.retrying_actions;

/**
 * by Aksenchenko Serhii on 11.05.2022
 */

@FunctionalInterface
public interface Retry {
    int run(Runnable action, int maxAttempts, long delayBeforeRetryMs);
}
