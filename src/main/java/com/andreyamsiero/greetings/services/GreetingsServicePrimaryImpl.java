package com.andreyamsiero.greetings.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingsServicePrimaryImpl implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "Hello personas from the primary service!!!";
    }
}
