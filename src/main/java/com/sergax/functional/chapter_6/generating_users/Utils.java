package com.sergax.functional.chapter_6.generating_users;

import lombok.NoArgsConstructor;

import java.util.stream.Stream;

/**
 * @author : sergax
 * @date : 30.05.22
 *
 * You need to implement a method named generateUsers that generates the specified number of users.
 * A user has an id and an email, and the values of these fields must be unique among the generated
 * users (without duplicates), e.g:
 */

@NoArgsConstructor
public class Utils {
    public static Stream<User> generateUsers(int numberOfUsers) {
        return Stream.iterate(0, (id) -> id + 1)
                .limit(numberOfUsers)
                .map(id -> new User(id, String.format("user%s@gmail.com", id)))
                .distinct();
        // write your code here
    }
}
