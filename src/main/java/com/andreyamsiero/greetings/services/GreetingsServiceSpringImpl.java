package com.andreyamsiero.greetings.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceSpringImpl implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "Hello personas from the base service!!!";
    }
}
