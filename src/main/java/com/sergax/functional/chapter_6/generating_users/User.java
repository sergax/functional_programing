package com.sergax.functional.chapter_6.generating_users;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author : sergax
 * @date : 30.05.22
 */

@AllArgsConstructor
@Getter
public class User {
    private final long id;
    private final String email;
}
