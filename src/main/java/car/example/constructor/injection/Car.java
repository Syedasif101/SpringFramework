package car.example.constructor.injection;

public class Car {

    Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void display()
    {
        System.out.println("Car Details: " + specification.toString());
    }
}
