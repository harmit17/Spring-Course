package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx=SpringApplication.run(DiDemoApplication.class, args);//run method return back to applicationcontext to work with,basically handle on the context

        MyController controller = (MyController) ctx.getBean("myController"); // creating Spring Bean gives name 'myController' ,asking context for a Bean called myController

        System.out.println(controller.hello());//call MyController class method hello and print Hello!!.. and primary bean invoked(PrimaryGreetingService) and print Primary Greeting Service
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());//For PropertyInjectedController(using property) class call GreetingServiceImpl(class) method and print Hello GURUS
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());//For SetterInjectedController Class call SetterGreetingService(class) method and print Hello!! I was Injcted by Setter!!
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());//For ConstructorInjectedController class call ConstructorGreetingService(class) method and print Hello! i was injcted by Constructor!!..
    }

}

