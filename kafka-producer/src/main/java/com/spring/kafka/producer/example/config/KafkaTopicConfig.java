package com.spring.kafka.producer.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic myTopic() {
        return TopicBuilder.name("Kafka_Example")
                .partitions(3) // Optional: specify number of partitions
                .replicas(1) // Optional: specify number of replicas
                .build();
    }

    @Bean
    public NewTopic anotherTopic() {
        return TopicBuilder.name("Kafka_Example_json")
                .partitions(3)
                .replicas(1)
                .compact() // Optional: configure topic compaction
                .build();
    }
}
