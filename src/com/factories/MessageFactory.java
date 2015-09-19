/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factories;

import com.enums.MessageType;
import com.implementations.EmailImplementation;
import com.implementations.SMSImplementation;
import com.implementations.WhatsUpImplementation;
import com.interfaces.MessageService;

/**
 *
 * @author criminal
 */
public class MessageFactory {
    
    /**
     * Get message service from type
     * 
     * @param type
     * @return 
     * @throws java.lang.Exception 
     */
    public static MessageService getTypeOfMessage(MessageType type) throws Exception
    {
        switch (type)
        {
            case EMAIL:
                return new EmailImplementation();
            case SMS:
                return new SMSImplementation();
            case WHATSUP:
                return new WhatsUpImplementation();     
                
        }
        //If type is not valid throw exception
        throw new Exception("Wine Maker Type not found");
        
    }
    
}
