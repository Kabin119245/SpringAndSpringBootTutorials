package com.kabin.Spring_Security_Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // Base URL for the controller
public class HelloController {

    @GetMapping("/hello") // Endpoint URL
    public String greet() {
        return "Hello World";
    }
}
