package com.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
	
	private KafkaTemplate<String,String> kafkaTemplate;

	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String message) {
		logger.info("Message sent is "+message);
		kafkaTemplate.send("kafkaTopic1", message);
	}

}
