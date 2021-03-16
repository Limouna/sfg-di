package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    private GreetingsServices greetingsServices;

    @Autowired
    public void setGreetingsServices(@Qualifier("setterInjectedGreetingService") GreetingsServices greetingsServices) {
        this.greetingsServices = greetingsServices;
    }

    public String getGreeting() {
        return greetingsServices.sayGreeting();
    }
}
