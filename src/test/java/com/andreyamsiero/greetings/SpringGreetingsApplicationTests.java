package com.andreyamsiero.greetings;

import com.andreyamsiero.greetings.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringGreetingsApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void getControllerFromAutowired() {
		System.out.println(myController.sayHello());
	}

	@Test
	void getControllerFromContext() {
		MyController controller = applicationContext.getBean(MyController.class);
		System.out.println(controller.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
