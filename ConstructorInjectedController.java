package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
    @Autowired                              //for constructor based dependency injection @Autowired is not compulsory(automatic autowiring)
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
