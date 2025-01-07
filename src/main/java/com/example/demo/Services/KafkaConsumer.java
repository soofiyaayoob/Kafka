package com.example.demo.Services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.anObject;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {
	
//	 @KafkaListener(topics = "Topic", groupId = "group_id_1")
//	    public void consume(String message) {
//	        System.out.println("Received message: " + message);
//	    }
	 @KafkaListener(topics = "Topic", groupId = "group_id_1")
	    public void consume(anObject object) {
		 log.info("consumer1 consume the message {} ", object.toString());
		
	    }

}
