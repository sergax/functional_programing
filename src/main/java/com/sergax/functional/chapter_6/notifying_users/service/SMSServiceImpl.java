package com.sergax.functional.chapter_6.notifying_users.service;

import com.sergax.functional.chapter_6.notifying_users.User;

/**
 * @author : sergax
 * @date : 01.06.22
 */
public class SMSServiceImpl implements SMSService {
    @Override
    public void sendSMS(User user) {
        System.out.println("sending sms to : " + user.getPhoneNumber());
    }
}
