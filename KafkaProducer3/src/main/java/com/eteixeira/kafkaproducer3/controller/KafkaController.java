package com.eteixeira.kafkaproducer3.controller;

import com.eteixeira.kafkaproducer3.service.KafkaProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    public KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public String publishMessage(@RequestParam("message") String message) throws InterruptedException {
        kafkaProducer.sendMessage("topic-test");
        return "Mensagem enviada para o tópico!";
    }
}
