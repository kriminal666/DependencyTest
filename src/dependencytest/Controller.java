/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencytest;

import com.classes.Person;
import com.injector.ServiceInjector;
import com.interfaces.Consumer;
import com.interfaces.MessageService;

/**
 *
 * @author criminal
 */
public class Controller {
    
    
    public static void sendMessage(MessageService type, Person person,String msg,String email){
       
        ServiceInjector injector = null;
        Consumer app = null;
         
        //Send message
        injector = new ServiceInjector(type);
        app = injector.getConsumer();
        app.processMessages(msg, person.getEmail());
    }
}
