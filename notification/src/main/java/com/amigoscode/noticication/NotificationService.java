package com.amigoscode.noticication;

import com.amigoscode.clients.notification.NotificationRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @Author Amimul Ehsan
 * @Project amigosservices
 */

@Service
public record NotificationService(NotificationRepository notificationRepository) {

    public void send( NotificationRequest notificationRequest ) {
        notificationRepository.save(
                Notification.builder()
                        .toCustomerId(notificationRequest.toCustomerId())
                        .toCustomerEmail(notificationRequest.toCustomerName())
                        .sender("Amigoscode")
                        .message(notificationRequest.message())
                        .sentAt(LocalDateTime.now())
                        .build()
        );
    }
}
