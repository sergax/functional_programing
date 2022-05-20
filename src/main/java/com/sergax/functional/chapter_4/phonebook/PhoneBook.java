package com.sergax.functional.chapter_4.phonebook;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, Collection<PhoneNumber>> nameToPhoneNumbersMap = new HashMap<>();

    public void addNewPhoneNumbers(String name, Collection<PhoneNumber> numbers) {
        // write your code here
        nameToPhoneNumbersMap.put(name, numbers);

    }

    public void printPhoneBook() {
        // write your code here
        nameToPhoneNumbersMap.forEach(
                (key, value) -> System.out.println(key + " " + value));
    }
}
