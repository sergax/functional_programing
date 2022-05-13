package com.sergax.functional.method_references.filtering_accounts;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * by Aksenchenko Serhii on 13.05.2022
 */

@AllArgsConstructor
@Data
public class Account {
    private String number;
    private long balance;
    private boolean locked;
}
