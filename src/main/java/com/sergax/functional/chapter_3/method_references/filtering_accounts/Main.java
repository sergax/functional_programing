package com.sergax.functional.chapter_3.method_references.filtering_accounts;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * by Aksenchenko Serhii on 13.05.2022
 */
public class Main {
    public static void printFilteredAccounts(List<Account> accounts) {
        // write your code here
        List<Account> nonEmptyAccounts = filter(accounts,
                account -> account.getBalance() > 0);

        // write your code here
        List<Account> accountsWithTooMuchMoney = filter(accounts,
                account -> !account.isLocked() && account.getBalance() >= 100_000_000);

        // Please, do not change the code below
        nonEmptyAccounts.forEach(a -> System.out.print(a.getNumber() + " "));
        accountsWithTooMuchMoney.forEach(a -> System.out.print(a.getNumber() + " "));
    }

    public static <T> List<T> filter(List<T> elems, Predicate<T> predicate) {
        return elems.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Account> accounts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] values = scanner.nextLine().split("\\s+");
            Account acc = new Account(
                    values[0],
                    Long.parseLong(values[1]),
                    Boolean.parseBoolean(values[2])
            );
            accounts.add(acc);
        }
        printFilteredAccounts(accounts);
    }
}
