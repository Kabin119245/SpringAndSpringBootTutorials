package com.kabin;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
//@Component("com2") we can specify bean name also
public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop object created");
    }

    public void compile() {
        System.out.println("Compiling using Desktop");
    }
 }
