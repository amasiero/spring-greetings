package com.andreyamsiero.greetings;

import com.andreyamsiero.greetings.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringGreetingsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringGreetingsApplication.class, args);
		MyController controller = ctx.getBean(MyController.class);
		System.out.println("Inside the main...");
		System.out.println(controller.sayHello());
	}

}
