package com.Qualifier.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    @Qualifier("dieselEngine")
    private Engine engine;


    public void run()
    {
        engine.start();
        System.out.println("Car is driving...");
    }
}
