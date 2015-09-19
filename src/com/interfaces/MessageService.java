/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaces;

/**
 *
 * @author criminal
 */
public interface MessageService {
    /**
     * Send the message
     * 
     * @param msg
     * @param receiver 
     */
    void sendMessage(String msg,String receiver);
    
}
