package com.example.demo.spring.secheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class springScheduledDemo {
    @Scheduled(cron = "1/5 * * * * ?")
    public void testScheduled(){
        System.out.println("springScheduled run:" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}