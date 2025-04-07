package net.engineeringdigest.journalApp.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTest {

    @Autowired
    private EmailService emailService;

    @Disabled
    @Test
    public void testSendEmail() {
        emailService.sendEmail(
                "princejain8109@gmail.com",
                "Testing Java Mail Sender",
                "Hi Prince,\n" +
                        "You have added ₹16200.00 successfully to your Amazon Pay Wallet");
    }
}
