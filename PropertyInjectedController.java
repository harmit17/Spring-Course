package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired                                  //what you want to inject
    public GreetingService greetingServiceImpl;//using property

    public String sayHello(){

        return greetingServiceImpl.sayGreeting();
    }
}
