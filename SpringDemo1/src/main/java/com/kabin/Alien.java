package com.kabin;

public class Alien {

    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien Object is Created");
    }
//    public Alien(int age, Laptop lap) {
//        this.age = age;
//        this.com = lap;
//    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
    //    System.out.println("Setter is called");
        this.age = age;
    }



    public void code() {
        System.out.println("Coding....");
        com.compile();

    }
}
