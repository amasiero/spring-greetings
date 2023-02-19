package com.andreyamsiero.greetings.controllers;

import com.andreyamsiero.greetings.services.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContructorInjectedControllerTest {

    ContructorInjectedController contructorInjectedController;

    @BeforeEach
    void setUp() {
        contructorInjectedController = new ContructorInjectedController(new GreetingsServiceImpl());
    }

    @Test
    void sayGreetings() {
        System.out.println(contructorInjectedController.sayGreetings());
    }
}