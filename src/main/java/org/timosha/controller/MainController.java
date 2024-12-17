package org.timosha.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.timosha.service.ChatService;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final ChatService chatService;

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public String processMassageFromClient(String message){
        return "{\"response\" : \"" + chatService.answerMassage(message) + "\" }";
    }
}


