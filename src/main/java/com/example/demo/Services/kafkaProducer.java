package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class kafkaProducer {
	
public final KafkaTemplate<String, String> template;

public kafkaProducer(KafkaTemplate<String, String> template) {
	
	this.template = template;
}
public void sendMessage(String message) {
    template.send("Topic", message);
    
}
    
    //or 
    
//    // Send the message asynchronously to the Kafka topic dont wait for respose
//    CompletableFuture<SendResult<String, Object>> future = template.send("javatechie-demo-3", message);
//    
//    // When the send operation is completed, handle the result or error
//    future.whenComplete((result, ex) -> {
//        if (ex == null) {
//            // Success: message sent successfully
//            System.out.println("Sent message=[" + message + 
//                    "] to topic=[" + result.getRecordMetadata().topic() + 
//                    "] with offset=[" + result.getRecordMetadata().offset() + "]");
//        } else {
//            // Failure: an error occurred while sending the message
//            System.out.println("Unable to send message=[" + message + 
//                    "] due to: " + ex.getMessage());
//        }
//    });
//}
    
    //or
    
//    // Send the message synrously  and block the thread until it's completed
//    SendResult<String, Object> result = template.send("javatechie-demo-3", message).get();
//    
//    // Success: log the result, including offset and topic information
//    System.out.println("Sent message=[" + message +
//            "] to topic=[" + result.getRecordMetadata().topic() + 
//            "] with offset=[" + result.getRecordMetadata().offset() + "]");

}
