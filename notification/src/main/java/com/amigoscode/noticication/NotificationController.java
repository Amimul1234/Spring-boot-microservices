package com.amigoscode.noticication;

import com.amigoscode.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Amimul Ehsan
 * @Project amigosservices
 */

@RestController
@RequestMapping("api/v1/notification")
@AllArgsConstructor
@Slf4j
public record NotificationController(NotificationService notificationService) {

    @PostMapping
    public void sendNotification( @RequestBody NotificationRequest notificationRequest ) {
        log.info("New notification... {}", notificationRequest);
        notificationService.send(notificationRequest);
    }

}
