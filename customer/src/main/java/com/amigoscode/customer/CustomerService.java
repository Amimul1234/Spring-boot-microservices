package com.amigoscode.customer;

import org.springframework.stereotype.Service;

/**
 * @Author Amimul Ehsan
 * @Project amigosservices
 */

@Service
public record CustomerService(CustomerRepo customerRepo) {

    public void registerCustomer( CustomerRegistrationRequest customerRegistrationRequest ) {

        Customer customer = Customer.builder()
                .firstName(customerRegistrationRequest.firstName())
                .lastName(customerRegistrationRequest.lastName())
                .email(customerRegistrationRequest.email())
                .build();

        customerRepo.save(customer);
    }
}
