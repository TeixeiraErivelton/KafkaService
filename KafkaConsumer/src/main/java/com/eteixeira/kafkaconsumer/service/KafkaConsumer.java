package com.eteixeira.kafkaconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "topic-test", groupId = "grupo-consumidor")
    public void consume(String message) {
        System.out.println("Mensagem recebida: " + message);
    }
}