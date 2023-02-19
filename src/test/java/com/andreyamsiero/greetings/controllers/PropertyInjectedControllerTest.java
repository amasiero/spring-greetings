package com.andreyamsiero.greetings.controllers;

import com.andreyamsiero.greetings.services.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setup() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingsService = new GreetingsServiceImpl();
    }

    @Test
    void getGreetings() {
        System.out.println(propertyInjectedController.sayGreetings());
    }

}