package com.example.marcuseisele.kafkaplaygroundclient;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MessageStreams {
    String INPUT = "message-in";

    @Input(INPUT)
    SubscribableChannel inboundMessage();
}