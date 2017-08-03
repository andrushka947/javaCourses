package Builder;

public class NissanBuilder extends CarBuilder {

    @Override
    void buildModel() {
        car.setModel("Nissan");
    }
    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }
    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(300);
    }
}