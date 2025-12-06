package com.example.Websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;
    @GetMapping("poll/{newData}")
    private void dataPolling(@PathVariable String newData){
        simpMessagingTemplate.convertAndSend("/topic/data",newData);
    }
}
