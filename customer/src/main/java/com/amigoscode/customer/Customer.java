package com.amigoscode.customer;

import lombok.Builder;
import lombok.Data;

/**
 * @Author Amimul Ehsan
 * @Project amigosservices
 */

@Data
@Builder
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
