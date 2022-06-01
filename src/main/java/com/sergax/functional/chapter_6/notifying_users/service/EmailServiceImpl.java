package com.sergax.functional.chapter_6.notifying_users.service;

import com.sergax.functional.chapter_6.notifying_users.Application;
import com.sergax.functional.chapter_6.notifying_users.User;

/**
 * @author : sergax
 * @date : 01.06.22
 */
public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(User user) {
        System.out.println("sending email to : " + user.getEmail());
    }
}
