package com.kabin;

import com.kabin.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Dev dev = context.getBean(Dev.class);
        System.out.println(dev.getAge());

        dev.code();




    }
}
