package org.learning.controller;

import org.apache.kafka.clients.producer.Producer;
import org.learning.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class DemoController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("/produce")
    public void getMessageFromClient(@RequestParam("message") String message){
        producerService.publishMessage(message);
    }
}
