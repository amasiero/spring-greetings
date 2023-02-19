package com.andreyamsiero.greetings.controllers;

import com.andreyamsiero.greetings.services.GreetingsService;

public class SetterInjectedController {
    private GreetingsService greetingsService;

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayGreetings() {
        // You may have a problem of null pointer for this case
        return greetingsService.sayGreetings();
    }
}
