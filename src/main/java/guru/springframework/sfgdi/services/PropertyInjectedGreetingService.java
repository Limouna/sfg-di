package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingsServices{

    @Override
    public String sayGreeting() {
        return "Hello World -- Property";
    }
}
