package com.kabin.SpringSecTelusko;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HelloController {

    @GetMapping("/")
    public String greet( ) {
        return "Hello, Spring Security!";
    }

}
