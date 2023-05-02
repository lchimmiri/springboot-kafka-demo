package org.learning.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "demo_topic", groupId = "demo_grp")
    public void consumeMessage(String message){
        System.out.println("The message received is :: "+message);
    }

    @KafkaListener(topics = "demo_topic", groupId = "demo_grp2")
    public void consumeMessage2(String message){
        System.out.println("The message received is :: "+message);
    }
}
