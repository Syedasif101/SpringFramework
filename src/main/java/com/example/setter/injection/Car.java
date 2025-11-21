package com.example.setter.injection;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }


    public String getDetails()
    {
        return specification.toString();
    }
}
