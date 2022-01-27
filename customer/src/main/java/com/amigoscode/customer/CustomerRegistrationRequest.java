package com.amigoscode.customer;

/**
 * @Author Amimul Ehsan
 * @Project amigosservices
 */

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
