package com.company;

public class Main {
		
	//Komentarz - zmiana w zdalnym repo
	
    public static void main(String[] args) {
	    Vehicle vehicle = new Vehicle();
	    Vehicle car = new Car();
	    Vehicle sportCar = new SportCar();

	    SportCar sc = (SportCar) sportCar; //1.rzutowanie Vehicle do SportCar
	   // sc.go();
        //((SportCar) sportCar).go(); //2.rzutowanie Vehicle do SportCar

        Vehicle[] vehicles = {vehicle,car,sportCar};

        for(Vehicle v : vehicles )
        {
            if(v instanceof SportCar)
            {
                ((SportCar) v).go();
                ((SportCar) v).horn();
                ((SportCar) v).turbo();
            }
            else if(v instanceof Car )
            {
                ((Car)v).go();
                ((Car) v).horn();
            }
             else{
                 v.go();
             }
            System.out.println("######################");
        }
    }
}






