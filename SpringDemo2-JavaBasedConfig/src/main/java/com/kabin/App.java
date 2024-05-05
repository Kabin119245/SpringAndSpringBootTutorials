package com.kabin;

import com.kabin.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Devs dev = context.getBean(Devs.class);
        System.out.println(dev.getAge());
        dev.code();

//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();

    }
}
