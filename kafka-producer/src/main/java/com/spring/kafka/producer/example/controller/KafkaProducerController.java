package com.spring.kafka.producer.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.kafka.producer.example.entity.User;

@RestController
@RequestMapping("/kafka-producer")
public class KafkaProducerController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC_1 = "Kafka_Example";

    @GetMapping("/string/{str}")
    public String produceMessage(@PathVariable("str") String str) {

        kafkaTemplate.send(TOPIC_1, str);

        return "Produced Message for " + str;
    }

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate_2;

    private static final String TOPIC_2 = "Kafka_Example_json";

    @GetMapping("/user/{user}")
    public String produceUserMessage(@PathVariable("user") String name) {
        String key = name;
        User user1 = new User(name, "Technology", 12000L);
        kafkaTemplate_2.send(TOPIC_2, key, user1);
        System.out.println("Message sent with key: " + key + ", value: " + user1.toString());
        return "Produced Message for " + user1.toString();
    }

}
