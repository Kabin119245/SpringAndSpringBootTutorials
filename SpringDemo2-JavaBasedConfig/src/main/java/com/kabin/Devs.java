package com.kabin;

public class Devs {
    private int age;
    private Computer com;

    public Devs() {
        System.out.println("Devs Object is created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }


    public void code() {
        System.out.println("Coding....");
        com.compile();
    }
}
