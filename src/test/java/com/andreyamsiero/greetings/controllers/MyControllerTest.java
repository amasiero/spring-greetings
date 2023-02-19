package com.andreyamsiero.greetings.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void callGreetingsFromService() {
        MyController myController = new MyController();
        System.out.println(myController.sayHello());
    }
}