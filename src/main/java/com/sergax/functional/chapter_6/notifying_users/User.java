package com.sergax.functional.chapter_6.notifying_users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author : sergax
 * @date : 01.06.22
 */

@AllArgsConstructor
@Getter
public class User {
    private final String email;
    private final String phoneNumber;
}
