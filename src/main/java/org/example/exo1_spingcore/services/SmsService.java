package org.example.exo1_spingcore.services;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageService {
    @Override
    public String getMessage() {
        return "Message envoyé par SMS.";
    }
}
