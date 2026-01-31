# Springboot-Email-Sending-Service
# Email Sending API

A **Spring Boot** application for sending emails with PDF attachments using **JavaMailSender**.

---

## Features

- Send emails with PDF attachments.
- REST API endpoint for sending emails.
- Configure Gmail SMTP using Spring Boot properties.
- Simple and easy-to-use API.

---

## Technologies Used

- **Java 17+**
- **Spring Boot**
- **Spring Mail / JavaMailSender**
- **Maven**
- **JUnit 5** (for testing)
- **Swagger / Postman** (for API testing)
- IDEs: **Eclipse, STS**

---

## Prerequisites

- **Java JDK 17+**
- **Maven**
- **Gmail Account** with App Password enabled
- **Internet Connection** to send emails

---

## Sample API Request Body (JSON)

```json
{
  "to": "pranavwandre14@gmail.com",
  "subject": "Application for Full Stack Developer Position – Pranav Wandre",
  "body": "Hi,\nI’m Pranav, a full stack developer with almost 3 years of experience. I’m exploring new opportunities where I can contribute and grow.\nAttaching my resume for your review.\nThanks for your time!\n\nThanks & Regards,\nPranav Wandre\n📞 +91-98654******",
  "fileName": "D:/Email_Send_Resume/Pranav_Wandre_Resume_S.pdf"
}
