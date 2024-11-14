package com.eteixeira.kafkaproducer2.controller;

import com.eteixeira.kafkaproducer2.service.KafkaProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    public KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public String publishMessage() throws InterruptedException {
        kafkaProducer.sendMessage("topic-test");
        return "Mensagem enviada para o tópico!";
    }
}
