package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsServices;
import org.springframework.stereotype.Controller;

@Controller
public class ContructorInjectedController {

    private final GreetingsServices greetingsServices;

    public ContructorInjectedController(GreetingsServices greetingsServices) {
        this.greetingsServices = greetingsServices;
    }

    public String getGreeting() {
        return greetingsServices.sayGreeting();
    }
}
