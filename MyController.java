package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller                     //make it as a spring componenet & managed by Spring Context(Created as a Spring Bean)
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){

        System.out.println("Hello!!..");
        return greetingService.sayGreeting();
    }
}
