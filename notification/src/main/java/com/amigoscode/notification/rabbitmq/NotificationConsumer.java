package com.amigoscode.notification.rabbitmq;

import com.amigoscode.clients.notification.NotificationRequest;
import com.amigoscode.notification.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author Amimul Ehsan
 * @Project amigosservices
 */

@Slf4j
@Component
public record NotificationConsumer(NotificationService notificationService) {

    @RabbitListener(queues = "${rabbitmq.queue.notification}")
    public void consumer( NotificationRequest notificationRequest ) {
        log.info("Consumed {} from queue", notificationRequest);
        notificationService.send(notificationRequest);
    }

}
