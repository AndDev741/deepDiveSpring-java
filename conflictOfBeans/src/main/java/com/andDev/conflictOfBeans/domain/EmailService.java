package com.andDev.conflictOfBeans.domain;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String msg){
        System.out.println("Sending message by email: " + msg);
    }
}
