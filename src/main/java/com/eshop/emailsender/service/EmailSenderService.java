package com.eshop.emailsender.service;

public interface EmailSenderService {
    void sendEmail(String to, String from, String message);
}
