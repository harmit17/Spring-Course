package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired//what you want to inject
    @Qualifier("greetingServiceImpl")   //If @Qualifier is commented then primaryservice will override sayHello() and printHello!!-Primary Greeting Service 2 times
    public GreetingService greetingServiceImpl;//using property

    public String sayHello(){

        return greetingServiceImpl.sayGreeting();
    }
}
