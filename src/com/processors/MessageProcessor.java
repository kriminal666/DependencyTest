/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.processors;

import com.interfaces.Consumer;
import com.interfaces.MessageService;

/**
 *
 * @author criminal
 */
public class MessageProcessor implements Consumer{
 
    private MessageService service;
     
    /**
     * Constructor
     * 
     * @param svc 
     */
    public MessageProcessor(MessageService svc){
        this.service=svc;
    }
     
    @Override
    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }
    
}
