package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

@Controller                     //make it as a spring componenet & managed by Spring Context(Created as a Spring Bean)
public class MyController {

    public String hello(){

        System.out.println("Hello!!..");
        return "foo";
    }
}
