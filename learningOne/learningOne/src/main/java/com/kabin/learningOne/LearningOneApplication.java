package com.kabin.learningOne;

import com.kabin.learningOne.model.Alien;
import com.kabin.learningOne.model.Laptop;
import com.kabin.learningOne.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningOneApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(LearningOneApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);











//		Alien a1 = context.getBean(Alien.class);
//		System.out.println(a1.getAge());
//		a1.code();
	}

}
