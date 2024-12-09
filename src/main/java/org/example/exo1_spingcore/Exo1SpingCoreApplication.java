package org.example.exo1_spingcore;

import org.example.exo1_spingcore.services.NotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Exo1SpingCoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        NotificationService notificationService = context.getBean(NotificationService.class);
        notificationService.sendNotification();
    }
}