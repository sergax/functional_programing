package com.sergax.functional.chapter_6.notifying_users;

import com.sergax.functional.chapter_6.notifying_users.service.EmailService;
import com.sergax.functional.chapter_6.notifying_users.service.EmailServiceImpl;
import com.sergax.functional.chapter_6.notifying_users.service.SMSService;
import com.sergax.functional.chapter_6.notifying_users.service.SMSServiceImpl;

/**
 * @author : sergax
 * @date : 01.06.22
 */

public class Main {
    public static void main(String[] args) {
        User user = new User("email@mail.com", "372572");
        SMSService service = new SMSServiceImpl();
        EmailService emailService = new EmailServiceImpl();
        Application application = new Application(emailService, service);
        application.run(user);
    }
}
