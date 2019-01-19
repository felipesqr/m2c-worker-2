package com.felipesqr.controller;

import com.felipesqr.jms.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {


    private MessageProducer messageProducer = new MessageProducer();

    @GetMapping("message/{message}")
    public String publish(@PathVariable("message") final String message) {
        messageProducer.sendMessage(message);
        return "message sent";

    }

    @RequestMapping("/oi")
    public String hello() {
        return "Oi!";

    }

}
// TODO criar endpoint do frontend
// TODO Criar acesso ao banco de dados padrão
// TODO Criar padrão de mensagens em dependencia M2C.Patterns

