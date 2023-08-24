package com.mrprk.kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrprk.crud.StudentData;
import com.mrprk.kafka.producer.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

	private KafkaProducer kafkaProducer;

	public MessageController(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}

	// http:localhost:8080/api/v1/kafka/publish
	@GetMapping("/publish")
	public ResponseEntity<String> publishMsg() {
		StudentData stdData = new StudentData();
		stdData.setId(1);
		stdData.setName("Ashish");
		stdData.setLocation("Bangalore");
		stdData.setDapertment("JAVA");
		kafkaProducer.sendMessage(stdData.getName() + " " + stdData.getDapertment() + " " + stdData.getLocation());
		return ResponseEntity.ok("Data has been sent to the claster : topic : student");
	}

}
