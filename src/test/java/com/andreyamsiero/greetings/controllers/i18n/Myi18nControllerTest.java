package com.andreyamsiero.greetings.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Myi18nControllerTest {

    @Autowired
    Myi18nController myi18nController;
    @Test
    void sayHello() {
        System.out.println(myi18nController.sayHello());
    }
}