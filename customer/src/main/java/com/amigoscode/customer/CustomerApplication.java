package com.amigoscode.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Amimul Ehsan
 * @Project amigosservices
 */

@EnableFeignClients(
        basePackages = "com.amigoscode.clients"
)
@EnableEurekaClient
@SpringBootApplication(
        scanBasePackages = {
                "com.amigoscode.customer",
                "com.amigoscode.amqp"
        }
)
public class CustomerApplication {
    public static void main( String[] args ) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
