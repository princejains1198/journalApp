package net.engineeringdigest.journalApp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTest {

    @Autowired
    private EmailService emailService;

    @Test
    public void testSendEmail() {
        emailService.sendEmail(
                "neelambpl12@gmail.com",
                "Testing Java Mail Sender",
                "Hi Neelam,\n" +
                        "You have added ₹16200.00 successfully to your Amazon Pay Wallet");
    }
}
