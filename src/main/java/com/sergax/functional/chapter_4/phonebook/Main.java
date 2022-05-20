package com.sergax.functional.chapter_4.phonebook;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : sergax
 * @date : 20.05.22
 */

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        List<PhoneNumber> listMaria = new ArrayList<>();
        listMaria.add(new PhoneNumber(PhoneNumberType.HOME, "0667730545"));
        listMaria.add(new PhoneNumber(PhoneNumberType.WORK, "0667730545"));
        pb.addNewPhoneNumbers("Maria", listMaria);
        List<PhoneNumber> listAlex = new ArrayList<>();
        listAlex.add(new PhoneNumber(PhoneNumberType.MOBILE, "123456789"));
        pb.addNewPhoneNumbers("Alex", listAlex);
        pb.printPhoneBook();
    }
}
