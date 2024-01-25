package com.wohr.notificationservice;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class NotificationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationServiceApplication.class, args);
    }

    @KafkaListener(topics = "notificationTopic", groupId = "notificationId")
    public void handleNotification(ConsumerRecord<String, OrderPlacedEvent> record) {
        OrderPlacedEvent orderPlacedEvent = record.value();
        log.info("=========== Consumer notificationTopic ======================= ");
        log.info("Received Notification for Order - {}", orderPlacedEvent.getOrderNumber());
        log.info("============================================================== ");
    }
}
