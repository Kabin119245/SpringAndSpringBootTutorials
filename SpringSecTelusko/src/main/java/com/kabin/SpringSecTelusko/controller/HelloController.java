package com.kabin.SpringSecTelusko.controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(HttpServletRequest request, HttpServletResponse response) {

        return "Hello, Spring Security!" + request.getSession().getId();
    }

}
