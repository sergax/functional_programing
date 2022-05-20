package com.sergax.functional.chapter_4.phonebook;

import java.util.*;

public class PhoneBook {
    private final Map<String, Collection<PhoneNumber>> nameToPhoneNumbersMap = new HashMap<>();

    public void addNewPhoneNumbers(String name, List<PhoneNumber> numbers) {
        // write your code here
        numbers.replaceAll(n -> new PhoneNumber(n.getType(), n.getNumber()));
        nameToPhoneNumbersMap.put(name, numbers);
    }

    public void printPhoneBook() {
        // write your code here
        nameToPhoneNumbersMap.forEach(
                (key, value) -> System.out.println(key + "\n" +
                        Arrays.toString(value.toArray())
                                .replaceAll("[PhoneNumber(type=, number=)]", "")
                                .replace("[]", "")));
    }
}
