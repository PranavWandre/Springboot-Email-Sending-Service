package com.email.demo.service;

import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public String sendEmailWithPdf(String to, String subject, String body, String filePath) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(body);

            // Only attach if filePath is provided
            if (filePath != null && !filePath.isEmpty()) {
                File file = new File(filePath);
                if (!file.exists() || !file.isFile()) {
                    return "PDF not found: " + filePath;
                }
                helper.addAttachment(file.getName(), file);
            }

            mailSender.send(message);
            return "Email Sent Successfully!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to send email: " + e.getMessage();
        }
    }
}
