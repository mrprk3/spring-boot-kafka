package com.mrprk.kafka.cluster.topic;

// Here we are creating Kafka Cluster
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	@Bean
	public NewTopic student() {
		/*
		 * Here we are giving the topic name student in Cluster [topic can be anything
		 * related to information like paymentInfo, customerInfo etc]
		 */
		return TopicBuilder.name("student")/* .partitions(10) */.build();
	}

}
