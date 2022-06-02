package com.sergax.functional.chapter_6.payment_system;

import java.util.ArrayList;
import java.util.Scanner;

import static com.sergax.functional.chapter_6.payment_system.ChainOfResponsibilityDemo.commonRequestHandler;

/**
 * @author : sergax
 * @date : 01.06.22
 */
public class Main {
    // Don't change the code below
    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        final String requestData = scanner.nextLine();
        final Request notCompletedRequest = new Request(requestData);
        System.out.println(commonRequestHandler.handle(notCompletedRequest).getData());
    }
}
