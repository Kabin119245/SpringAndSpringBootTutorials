package com.kabin;

public class Laptop implements Computer {

        public Laptop() {
           System.out.println("Laptop Object is created");
        }
    @Override
    public  void compile() {
        System.out.println("Compiling in Laptop ");
    }
}
