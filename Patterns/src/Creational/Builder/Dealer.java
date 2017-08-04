package Creational.Builder;

public class Dealer {
    private CarBuilder carBuilder;

    Car buildCar(){
        carBuilder.createCar();
        carBuilder.buildModel();
        carBuilder.buildTransmission();
        carBuilder.buildMaxSpeed();
        return carBuilder.getCar();
    }

    public CarBuilder getCarBuilder() {
        return carBuilder;
    }

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
}
