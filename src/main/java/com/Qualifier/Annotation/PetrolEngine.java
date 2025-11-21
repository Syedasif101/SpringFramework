package com.Qualifier.Annotation;


import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Petrol Engine Starts...");
    }
}
