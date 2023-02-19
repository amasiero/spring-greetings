package com.andreyamsiero.greetings.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ContructorInjectedSpringControllerTest {

    @Autowired
    ContructorInjectedSpringController contructorInjectedSpringController;

    @Test
    void sayGreetings() {
        System.out.println(contructorInjectedSpringController.sayGreetings());
    }
}