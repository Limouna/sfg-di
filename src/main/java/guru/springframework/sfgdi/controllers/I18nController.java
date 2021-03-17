package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final GreetingsServices greetingsServices;

    public I18nController(@Qualifier("i18nService") GreetingsServices greetingsServices) {
        this.greetingsServices = greetingsServices;
    }

    public String sayHello() {
        return greetingsServices.sayGreeting();
    }
}
