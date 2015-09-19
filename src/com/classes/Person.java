/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

/**
 *
 * @author criminal
 */
public class Person {
    
   
    private String name;
    private String dni;
    private String email;
    /**
     * Constructor+
     * 
     * @param name
     * @param dni
     * @param email 
     */
    public Person(String name, String dni,String email) {
        this.name = name;
        this.dni = dni;
        this.email = email;
    }
    
//Getter and Setter
    
    /**
     * Get name
     * 
     * @return 
     */
    public String getName() {
        return name;
    }
    /**
     * Set name
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Get DNI
     * 
     * @return 
     */
    public String getDni() {
        return dni;
    }
    /**
     * Set DNI
     * 
     * @param dni 
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    /**
     * Get email
     * 
     * @return 
     */
    public String getEmail() {
        return email;
    }
    /**
     * Set email
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
     
    
}
