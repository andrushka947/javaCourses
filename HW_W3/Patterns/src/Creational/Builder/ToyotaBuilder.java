package Creational.Builder;

public class ToyotaBuilder extends CarBuilder {
    @Override
    void buildModel() {
        car.setModel("Toyota");
    }
    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }
    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(240 );
    }
}
