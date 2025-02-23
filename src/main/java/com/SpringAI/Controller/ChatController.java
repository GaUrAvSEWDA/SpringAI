package com.SpringAI.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.SpringAI.Service.ChatService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

// @RequestMapping("/api/v1/chat")
@RestController
@RequestMapping("/api/v1/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    // @GetMapping("/path")
    // public ResponseEntity<String> generateResponse(@RequestParam(value = "inputText",required = true) String inputText){
    //     // String responseText = chatService.generateResponse(inputText);
    //     return ResponseEntity.ok(inputText);
    // }

    @GetMapping("/path")
    public ResponseEntity<String> generateResponse(@RequestParam(value = "inputText",required = true) String inputText) {
        String responseText = chatService.generateResponse(inputText);
        return ResponseEntity.ok(responseText);
    }
    
    
}
