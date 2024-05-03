package com.kabin.learningOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningOneApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(LearningOneApplication.class, args);

		Alien a1 = context.getBean(Alien.class);
		a1.code();
	}

}
