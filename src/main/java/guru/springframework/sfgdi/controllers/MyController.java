package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsServices;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingsServices greetingsServices;

    public MyController(GreetingsServices greetingsServices) {
        this.greetingsServices = greetingsServices;
    }

    public String sayHello() {
        return greetingsServices.sayGreeting();
    }
}
