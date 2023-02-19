package com.andreyamsiero.greetings.controllers;

import com.andreyamsiero.greetings.services.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingsService(new GreetingsServiceImpl());
    }

    @Test
    void sayGreetings() {
        System.out.println(setterInjectedController.sayGreetings());
    }
}