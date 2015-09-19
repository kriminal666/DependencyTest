/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencytest;

import com.classes.Teacher;
import com.enums.MessageType;
import com.factories.MessageFactory;
import com.implementations.EmailImplementation;
import com.implementations.SMSImplementation;
import com.implementations.WhatsUpImplementation;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        try {
            //Email
            Controller.sendMessage(MessageFactory.getTypeOfMessage(MessageType.EMAIL),teach1,"Hello", "Carlitos");
            //SMS
            Controller.sendMessage(MessageFactory.getTypeOfMessage(MessageType.SMS), teach1, "hello", "Carlitos");
            //WhatsUp
            Controller.sendMessage(MessageFactory.getTypeOfMessage(MessageType.WHATSUP), teach1, "hello", "Carlitos");
        } catch (Exception ex) {
            Logger.getLogger(DependencyTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
