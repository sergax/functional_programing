package com.sergax.functional.chapter_4.sorting_accounts;

import lombok.AllArgsConstructor;
import lombok.Data;

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
}
