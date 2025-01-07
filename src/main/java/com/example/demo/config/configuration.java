package com.example.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class configuration {
	@Bean
	public NewTopic topic() {
		//public NewTopic(String name, int numPartitions, short replicationFactor)
		return new NewTopic("Topic", 1, (short) 1);
	}
	
            
}
