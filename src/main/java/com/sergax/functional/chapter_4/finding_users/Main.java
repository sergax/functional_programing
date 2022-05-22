package com.sergax.functional.chapter_4.finding_users;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : sergax
 * @date : 22.05.22
 */
public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Account1");
        Account account2 = new Account("Account2");
        Account account3 = new Account("Account3");
        Set usersSet = new HashSet();
        usersSet.add(new User("User1", account1));
        usersSet.add(new User("User2", account2));
        usersSet.add(new User("User3", account3));
        System.out.println(FindUserQuiz.findUserByAccountId(usersSet, "Account1"));//return Optional user object
        System.out.println(FindUserQuiz.findUserByAccountId(usersSet, "Account22"));//return Optional.empty
    }
}
