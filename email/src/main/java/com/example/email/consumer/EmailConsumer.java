package com.example.email.consumer;
import com.example.email.dto.EmailDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @RabbitListener
    public void listenEmailQueue(@Payload String message) {
        System.out.println(message);
    }


}
