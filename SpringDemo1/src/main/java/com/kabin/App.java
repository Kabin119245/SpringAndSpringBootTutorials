package com.kabin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

        //if we want to create a container we have to use ApplicationContext

        ApplicationContext context  = new ClassPathXmlApplicationContext("spring.xml");
        //above line basically creates container for us and object is created


        //Alien obj = (Alien) context.getBean("alien");//getting object
        //we dont have to do type casting as follows:

        Alien obj = context.getBean("alien", Alien.class);

        //  obj.setAge(21);
        System.out.println(obj.getAge());
        obj.code();



//        Laptop obj3 = (Laptop) context.getBean("com");
//        obj3.compile();


//        Alien obj1 = (Alien) context.getBean("alien"); //getting object
//        obj1.code();

        //even if the references are different, they both are same object


//        Computer com = context.getBean(Desktop.class);
//        //or we don't specify id
//        Desktop desk =context.getBean(Desktop.class);



    }
}
