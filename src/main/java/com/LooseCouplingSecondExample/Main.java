package com.LooseCouplingSecondExample;

public class Main {

    public static void main(String[] args)
    {
        Car c = new Car(new DieselEngine());
        c.drive();

        Car c2 = new Car(new PetrolEngine());
        c.drive();
    }
}
