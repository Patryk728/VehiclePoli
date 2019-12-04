package com.company;

public class SportCar extends Car{
    public SportCar() {
        //   System.out.println("Konstruktor SportCar");
    }

    @Override
    void go() {
        System.out.println("Jade sportowym autem");
    }
    void turbo()
    {
        System.out.println("głosny ryk silnika");
    }
}