package com.felipesqr.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @JmsListener(destination = "standalone.queue")
    public void consume(String message) {
        System.out.println("Received Message: " + message);
    }
}
