package com.sergax.functional.chapter_4.finding_users;

import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

/**
 * @author : sergax
 * @date : 22.05.22
 */
public class FindUserQuiz {
    public static Optional<User> findUserByAccountId(Set<User> users, String id) {
        // write your code here
        return users.stream()
                .filter(n ->
                        n.getAccount()
                                .orElseThrow()
                                .getId().equals(id)).findAny();
    }
}
