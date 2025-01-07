package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.kafkaProducer;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	
	public kafkaProducer producer;

	@Autowired
	public void setProducer(kafkaProducer producer) {
		this.producer = producer;
	}
	@GetMapping("/publish/{message}")
    public ResponseEntity<?>  publishMessage(@PathVariable String message) {
		System.out.println("got the req");
        try {
//            for (int i = 0; i <= 10000; i++) {
                producer.sendMessage(message + " : " );
           // }
            return ResponseEntity.ok("message published successfully ..");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }
	


	
	

}
