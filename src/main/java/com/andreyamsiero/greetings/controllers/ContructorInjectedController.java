package com.andreyamsiero.greetings.controllers;

import com.andreyamsiero.greetings.services.GreetingsService;

public class ContructorInjectedController {
    
    private final GreetingsService greetingsService;

    public ContructorInjectedController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayGreetings() {
        return greetingsService.sayGreetings();
    }
}
