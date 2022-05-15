package com.sergax.functional.chapter_3.method_references.retrying_actions;

import java.util.Scanner;

/**
 * by Aksenchenko Serhii on 11.05.2022
 *
 * Retrying actions via a method reference [HARD]
 * In this exercise, you are going to combine your knowledge of functional interfaces and method references together. There is a method named retryAction that accepts an action represented as a Runnable and retries the action with some delay until it is completed successfully or the maximum number of retries is reached.
 *
 * You need to:
 *
 * declare a method called run in the Retry interface to be able to use this interface with the retryAction method;
 * assign the method reference to retryAction to the retry variable.
 */
public class Retrying {
    private static final int MAX_ATTEMPTS = 10;
    private static final long DELAY_MS = 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RetryUtils.retry.run(() -> System.out.println(sc.nextLine()), MAX_ATTEMPTS, DELAY_MS);
    }
}
