package com.autowiring.constructor;

public class Car {

    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    //    public void setSpecification(Specification specification) {
//        this.specification = specification;
//    }

    public String getDetails(){

        return specification.toString();
    }

}
