package com.amigoscode.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Amimul Ehsan
 * @Project amigosservices
 */

@SpringBootApplication(
        scanBasePackages = {
                "com.amigoscode.notification",
                "com.amigoscode.amqp"
        }
)
public class NotificationApplication {
    public static void main( String[] args ) {
        SpringApplication.run(NotificationApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner( RabbitMqMessageProducer producer, NotificationConfig notificationConfig ) {
//        return args -> producer.publish(new Person("Ali", 30), notificationConfig.getInternalExchange(),
//                notificationConfig.getInternalNotificationRoutingKeys());
//    }
//
//    record Person(String name, int age){}
}
