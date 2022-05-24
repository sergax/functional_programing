package com.sergax.functional.chapter_4.printing_pro_users;

import java.util.Optional;

/**
 * @author : sergax
 * @date : 24.05.22
 */
public class User {
    private String login;
    private Account account;

    public User(String login, Account account) {
        this.login = login;
        this.account = account;
    }

    public String getLogin() {
        return login;
    }

    public Optional<Account> getAccount() {
        return Optional.ofNullable(account);
    }
}
