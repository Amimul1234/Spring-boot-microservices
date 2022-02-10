package com.amigoscode.amqp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

/**
 * @Author Amimul Ehsan
 * @Project amigosservices
 */

@Component
@Slf4j
public record RabbitMqMessageProducer(AmqpTemplate amqpTemplate) {
    public void publish( Object payLoad, String exchange, String routingKey ) {
        log.info("Publishing to {} using routing key {}. Payload : {}", exchange, routingKey, payLoad);
        amqpTemplate.convertAndSend(exchange, routingKey, payLoad);
        log.info("Published to {} using routing key {}. Payload : {}", exchange, routingKey, payLoad);
    }
}
