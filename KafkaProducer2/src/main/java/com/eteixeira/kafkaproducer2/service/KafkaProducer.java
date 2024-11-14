package com.eteixeira.kafkaproducer2.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic) throws InterruptedException {
        kafkaTemplate.send(topic, "Mensagem Producer 2");

        Thread.sleep(5000);
    }
}

