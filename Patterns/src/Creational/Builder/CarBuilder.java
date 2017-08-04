package Creational.Builder;

public abstract class CarBuilder {
    Car car;
    public void createCar() {
        car = new Car();
    }

    abstract void buildModel();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    Car getCar() {
        return car;
    }

}