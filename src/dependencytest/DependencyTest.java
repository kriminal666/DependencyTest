/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencytest;

import com.classes.Teacher;
import com.implementations.EmailImplementation;
import com.implementations.SMSImplementation;
import com.implementations.WhatsUpImplementation;

/**
 *
 * @author criminal
 */
public class DependencyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teacher teach1 = new Teacher("Carlos","333333333G","carlos@hotmail.com");
        //Email
       Controller.sendMessage(new EmailImplementation(),teach1,"Hello", "Carlitos");
       //SMS
       Controller.sendMessage(new SMSImplementation(), teach1, "hello", "Carlitos");
       //WhatsUp
       Controller.sendMessage(new WhatsUpImplementation(), teach1, "hello", "Carlitos");
    }
    
}
