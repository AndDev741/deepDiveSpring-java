package com.andDev.conflictOfBeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andDev.conflictOfBeans.domain.MessageService;

@RestController
@RequestMapping("/api")
public class MessageController {
    private final MessageService messageService;

    public MessageController(@Qualifier("smsService") MessageService messageService){
        this.messageService = messageService;
    }

    @GetMapping
    public void sendMessage(){
        messageService.sendMessage("Test message");
    }


}
