package com.sergax.functional.chapter_4.printing_pro_users;

import java.util.Set;

/**
 * @author : sergax
 * @date : 24.05.22
 * <p>
 * Implement a method that finds a user by a specified account id.
 * If the user's account type is "pro", the method should print a user's login.
 */

public class PrintingLoginQuiz {
    public static void printLoginIfPro(Set<User> users, String id) {
        // write your code here
        users.stream()
                .filter(n ->
                        n.getAccount()
                                .orElseThrow()
                                .getId().equals(id) &&
                                n.getAccount()
                                        .orElseThrow()
                                        .getType().equals("pro"))
                .findAny()
                .ifPresent(n -> System.out.println(n.getLogin()));
    }
}
