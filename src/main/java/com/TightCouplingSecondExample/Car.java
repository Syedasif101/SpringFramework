package com.TightCouplingSecondExample;

public class Car {
    // we are hard coding here and car depends on PetrolEngine
    PetrolEngine engine = new PetrolEngine();

    void start(){
        engine.start();
        System.out.println("Car is running");
    }
}
