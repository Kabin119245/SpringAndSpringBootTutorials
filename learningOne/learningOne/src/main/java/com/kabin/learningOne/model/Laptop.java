package com.kabin.learningOne.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {


    public void compile() {
        System.out.println("Compiling using Laptop....");

    }
}
