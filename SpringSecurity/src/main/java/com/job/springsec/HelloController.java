package com.job.springsec;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greet")
    public String greetUser() {
        return "Hello User!";
    }

}
