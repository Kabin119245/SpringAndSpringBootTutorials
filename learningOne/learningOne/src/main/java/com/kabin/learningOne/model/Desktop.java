package com.kabin.learningOne.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("Desktop is compiling...");
    }
}
