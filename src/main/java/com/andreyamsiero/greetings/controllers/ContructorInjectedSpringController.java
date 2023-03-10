package com.andreyamsiero.greetings.controllers;

import com.andreyamsiero.greetings.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ContructorInjectedSpringController {

    @Qualifier("greetingServiceImpl")
    private final GreetingsService greetingsService;

    @Autowired
    public ContructorInjectedSpringController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayGreetings() {
        return greetingsService.sayGreetings();
    }
}
