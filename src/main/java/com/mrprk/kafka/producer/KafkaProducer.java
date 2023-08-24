package com.mrprk.kafka.producer;
// Create Kafka producer
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

	private KafkaTemplate<String, String> kafkaTemplate;

	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	// Create a method which will use kafka template to send the messages
	public void sendMessage(String message) {
		LOGGER.info(String.format("Message sent %s", message));
		//topic name, message
		kafkaTemplate.send("student", message);
	}

}
