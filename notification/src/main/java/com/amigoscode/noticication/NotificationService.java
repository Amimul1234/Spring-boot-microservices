package com.amigoscode.noticication;

import com.amigoscode.clients.notification.NotificationRequest;

import java.time.LocalDateTime;

/**
 * @Author Amimul Ehsan
 * @Project amigosservices
 */

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
