package com.felipesqr.jms;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jms.core.JmsTemplate;

import javax.jms.Queue;


public class MessageProducer {

    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Queue queue;


    public void sendMessage(String message) {
        jmsTemplate.convertAndSend(queue, message);
    }
}
