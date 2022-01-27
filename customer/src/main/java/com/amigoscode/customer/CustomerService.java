package com.amigoscode.customer;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Amimul Ehsan
 * @Project amigosservices
 */

@Service
public record CustomerService(CustomerRepo customerRepo, RestTemplate restTemplate) {

    public void registerCustomer( CustomerRegistrationRequest customerRegistrationRequest ) {

        Customer customer = Customer.builder()
                .firstName(customerRegistrationRequest.firstName())
                .lastName(customerRegistrationRequest.lastName())
                .email(customerRegistrationRequest.email())
                .build();

        customerRepo.saveAndFlush(customer);

        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
                "http://localhost:8081/api/v1/fraud-check/{customerId}",
                FraudCheckResponse.class,
                customer.getId()
        );

        if (fraudCheckResponse.isFraudster())
            throw new IllegalStateException("Fraudster!!!");

    }
}
