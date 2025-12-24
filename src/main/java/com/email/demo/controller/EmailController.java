package com.email.demo.controller;

import com.email.demo.dto.EmailRequest;
import com.email.demo.service.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
@CrossOrigin(
    origins = "http://localhost:3000",
    allowedHeaders = "*",
    methods = {RequestMethod.POST, RequestMethod.OPTIONS}
)
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public String sendEmail(@RequestBody EmailRequest request) {
        return emailService.sendEmailWithPdf(
                request.getTo(),
                request.getSubject(),
                request.getBody(),
                request.getFileName()
        );
    }
}
