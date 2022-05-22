package com.sergax.functional.chapter_4.finding_users;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

/**
 * @author : sergax
 * @date : 22.05.22
 */

@AllArgsConstructor
@Getter
public class User {
    private final String login;
    private final Account account;

    public Optional<Account> getAccount() {
        return Optional.ofNullable(account);
    }
}
