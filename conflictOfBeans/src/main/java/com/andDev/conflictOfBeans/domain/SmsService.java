package com.andDev.conflictOfBeans.domain;

import org.springframework.stereotype.Service;

@Service
public class SmsService implements MessageService {
    @Override
    public void sendMessage(String msg){
        System.out.println("Sending message by SMS: " + msg);
    }
}
