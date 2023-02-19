package com.andreyamsiero.greetings.controllers;

import com.andreyamsiero.greetings.services.GreetingsService;
import com.andreyamsiero.greetings.services.GreetingsServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingsService greetingsService;

    public MyController() {
        this.greetingsService = new GreetingsServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm your controller");
        return greetingsService.sayGreetings();
    }
}
