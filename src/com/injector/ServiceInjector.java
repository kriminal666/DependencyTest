/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.injector;

import com.interfaces.Consumer;
import com.interfaces.MessageService;
import com.interfaces.MessageServiceInjector;
import com.processors.MessageProcessor;

/**
 *
 * @author criminal
 * 
 */
public class ServiceInjector implements MessageServiceInjector{
    
    private MessageService tipo;
    /**
     * Constructor
     * 
     * @param tipo 
     */
    public ServiceInjector(MessageService tipo) {
        this.tipo = tipo;
    }
    

    @Override
    public Consumer getConsumer() 
    {
       return new MessageProcessor(this.tipo);
    }

  
    
}
