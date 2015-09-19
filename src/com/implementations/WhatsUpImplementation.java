/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementations;

import com.interfaces.MessageService;

/**
 *
 * @author criminal
 */
public class WhatsUpImplementation implements MessageService {

    @Override
    public void sendMessage(String msg, String receiver)
    {
        System.out.printf("WHATSUP --->Message: %s Receiver: %s\n", msg, receiver);
    }
    
    
    
}
