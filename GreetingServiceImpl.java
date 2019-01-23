package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service                    //picked by spring
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS ="Hello GURUS!!..From GreetingServiceImpl";

    @Override
    public String sayGreeting(){

        return HELLO_GURUS;
    }
}
