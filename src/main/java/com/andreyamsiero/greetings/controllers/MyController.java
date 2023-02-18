package com.andreyamsiero.greetings.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("I'm your controller");
        return "Hello people!!!";
    }
}
