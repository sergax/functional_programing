package com.sergax.functional.chapter_6.notifying_users;

import com.sergax.functional.chapter_6.notifying_users.service.EmailService;
import com.sergax.functional.chapter_6.notifying_users.service.EmailServiceImpl;
import com.sergax.functional.chapter_6.notifying_users.service.SMSService;
import com.sergax.functional.chapter_6.notifying_users.service.SMSServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author : sergax
 * @date : 01.06.22
 */

@AllArgsConstructor
public class Application {
    private EmailService emailService;
    private SMSService smsService;

    public void run(User user) {
        emailService.sendEmail(user);
        smsService.sendSMS(user);
        //write code here
    }
}
