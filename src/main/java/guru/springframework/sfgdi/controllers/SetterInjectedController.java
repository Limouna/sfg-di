package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsServices;

public class SetterInjectedController {

    private GreetingsServices greetingsServices;

    public void setGreetingsServices(GreetingsServices greetingsServices) {
        this.greetingsServices = greetingsServices;
    }

    public String getGreeting() {
        return greetingsServices.sayGreeting();
    }
}
