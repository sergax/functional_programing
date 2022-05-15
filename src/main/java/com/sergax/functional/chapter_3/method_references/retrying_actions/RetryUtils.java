package com.sergax.functional.chapter_3.method_references.retrying_actions;

import lombok.NoArgsConstructor;

/**
 * by Aksenchenko Serhii on 11.05.2022
 */

@NoArgsConstructor
public class RetryUtils {
    public static Retry retry = RetryUtils::retryAction;

    private static int retryAction(
            Runnable action, int maxAttempts, long delayBeforeRetryMs) {

        int fails = 0;
        while (fails < maxAttempts) {
            try {
                action.run();
                return fails;
            } catch (Exception ex) {
                System.err.println("Something goes WRONG");
                fails++;
                try {
                    Thread.sleep(delayBeforeRetryMs);
                } catch (InterruptedException iex) {
                    throw new RuntimeException(iex);
                }
            }
        }
        return fails;
    }
}
