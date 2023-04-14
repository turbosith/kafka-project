package com.kafkaapplication.kafka.producer;

import com.kafkaapplication.kafka.message.Message;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, Object> kafkaTemplate) {
        return args -> {
            kafkaTemplate.send("topicname", new Message("123456Yd", "Custom message"));
        };
    }
}
