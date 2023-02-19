package com.andreyamsiero.greetings.controllers;

import com.andreyamsiero.greetings.services.GreetingsService;

public class PropertyInjectedController {

    GreetingsService greetingsService;

    public String sayGreetings() {
        return greetingsService.sayGreetings();
    }
}
