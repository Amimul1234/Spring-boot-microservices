package com.amigoscode.clients.notification;

/**
 * @Author Amimul Ehsan
 * @Project amigosservices
 */

public record NotificationRequest(Integer toCustomerId,
                                  String toCustomerName,
                                  String message) {
}
