package com.example.marcuseisele.kafkaplaygroundclient;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(MessageStreams.class)
@Slf4j
public class KafkaplaygroundClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaplaygroundClientApplication.class, args);
	}

	@StreamListener(MessageStreams.INPUT)
	private void handleMessage(MessageDTO messageDTO){
		log.info("Received: {}", messageDTO);
	}

	@Data
	static class MessageDTO {
		private Integer id;
		private String author;
		private String text;
	}
}
