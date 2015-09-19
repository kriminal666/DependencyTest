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
public interface Consumer {
    
    /**
     * Process the messages
     * 
     * @param msg
     * @param rec 
     */
    void processMessages(String msg, String rec);
    
}
