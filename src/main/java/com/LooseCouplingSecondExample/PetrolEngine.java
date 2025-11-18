package com.LooseCouplingSecondExample;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Petrol Engine Starts");
    }
}
