package com.company;

public class Car extends Vehicle{
    public Car() {
        //  System.out.println("Konstruktor Car");
    }

    @Override
    void go() {
        System.out.println("Jade autem");
    }
    void horn(){
        System.out.println("Beep beep");
    }
}
