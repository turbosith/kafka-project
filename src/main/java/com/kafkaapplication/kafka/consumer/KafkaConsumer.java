package com.kafkaapplication.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@EnableKafka
@Slf4j
@Component
public class KafkaConsumer {


    @KafkaListener(topics = "topicname", groupId = "groupId")
    void listener(String data) {
        log.info("Get message: " + data);
    }
}
