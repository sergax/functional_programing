package com.sergax.functional.chapter_4.phonebook;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PhoneNumber {
    private PhoneNumberType type;
    private String number;
}
