package com.example.chat.gpt.y.spring.boot;

import io.github.flashvayne.chatgpt.service.ChatgptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChatGptController {
    //creo el servicio con el que voy a poder hacer preguntas a gpt
    @Autowired
    private ChatgptService chatgptService;

    @GetMapping("/chat")
    public String chatWith(@RequestParam String message) {
        System.out.println(message);
        return chatgptService.sendMessage(message);
    }
}
