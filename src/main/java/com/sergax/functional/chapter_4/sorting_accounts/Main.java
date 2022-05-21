package com.sergax.functional.chapter_4.sorting_accounts;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : sergax
 * @date : 21.05.22
 */

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();

        accounts.add(new Account("Peter", 1000L, false));
        accounts.add(new Account("John", 1000L, false));
        accounts.add(new Account("Ivan", 8000L, true));
        accounts.add(new Account("Helen", 5000L, false));
        accounts.add(new Account("Nicole", 3000L, true));

        accounts.sort(Account.getComparatorByLockedBalanceAndOwner());

        accounts.forEach(System.out::println);
    }
}
