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
	private KafkaTemplate<String, User> kafkaTemplate;

	private static final String TOPIC = "Kafka_Example_json";

	@GetMapping("/{user}")
	public String produceMessage(@PathVariable("user") String user) {

		kafkaTemplate.send(TOPIC, new User(user, "Technology", 12000L));

		return "Produced Message for " + user;
	}

}
