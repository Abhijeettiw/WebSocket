package com.example.Websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSocketController {

    @Autowired
    private WebSocketConfig webSocketConfig;

    @GetMapping("/send")
    public ResponseEntity<?> sendRealTimeData() {
        return null;
    }
}
