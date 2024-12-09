package org.example.exo1_spingcore.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    private MessageService messageService;

    @Autowired
    @Qualifier("emailService") // Spécifiez ici le nom du bean à injecter
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification() {
        System.out.println(messageService.getMessage());
    }
}
