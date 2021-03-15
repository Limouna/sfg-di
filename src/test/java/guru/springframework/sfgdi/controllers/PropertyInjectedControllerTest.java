package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingsServices = new GreetingsServicesImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}