package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingsServices{


    @Override
    public String sayGreeting() {
        return "Hello World -- From the primary bean";
    }
}
