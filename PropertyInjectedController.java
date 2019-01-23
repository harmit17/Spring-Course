package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired                                  //what you want to inject
    public GreetingService greetingService;

    public String sayHello(){

        return greetingService.sayGreeting();
    }
}
