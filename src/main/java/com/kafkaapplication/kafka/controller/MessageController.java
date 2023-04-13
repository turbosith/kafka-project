package com.kafkaapplication.kafka.controller;

import com.kafkaapplication.kafka.message.Message;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class MessageController {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    @PostMapping("/send")
    public void sendMessage(@RequestBody Message message) {
        kafkaTemplate.send("topicname", message);
    }
}
