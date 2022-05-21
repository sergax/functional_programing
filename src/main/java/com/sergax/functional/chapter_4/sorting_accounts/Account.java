package com.sergax.functional.chapter_4.sorting_accounts;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;

/**
 * @author : sergax
 * @date : 21.05.22
 */
@AllArgsConstructor
@Data
class Account {
    private final String owner;
    private final long balance;
    private final boolean locked;

    public static Comparator<Account> getComparatorByLockedBalanceAndOwner() {
        // write your code here
        return Comparator
                .comparing(Account::isLocked)
                .thenComparing(Account::getBalance, Comparator.reverseOrder())
                .thenComparing(Account::getOwner);
    }
}
