package com.sergax.functional.chapter_4.phonebook;

import java.util.*;

public class PhoneBook {
    private final Map<String, Collection<PhoneNumber>> nameToPhoneNumbersMap = new HashMap<>();
    public void addNewPhoneNumbers(String name, Collection<PhoneNumber> numbers) {
        // write your code here
        nameToPhoneNumbersMap.merge(name, new ArrayList<>(numbers),
                (a, b) -> {
                    a.addAll(b);
                    return a;
                });
    }

    public void printPhoneBook() {
        // write your code here
        //[PhoneNumber(type=HOME, number=0667730545), PhoneNumber(type=WORK, number=0667730545)]
        nameToPhoneNumbersMap.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(n -> System.out.println(n.getType() + ": " + n.getNumber()));
        });
    }
}
