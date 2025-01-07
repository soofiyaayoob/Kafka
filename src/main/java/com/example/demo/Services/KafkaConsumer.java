package com.example.demo.Services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {
	
	 @KafkaListener(topics = "Topic", groupId = "group_id_1")
	    public void consume(String message) {
		 log.info("consumer1 consume the message {} ", message);
		 

	    }

}
