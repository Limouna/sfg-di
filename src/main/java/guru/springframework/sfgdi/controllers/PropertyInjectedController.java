package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsServices;

public class PropertyInjectedController {

    public GreetingsServices greetingsServices;

    public String getGreeting() {
        return greetingsServices.sayGreeting();
    }
}
