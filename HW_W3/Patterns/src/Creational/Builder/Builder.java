package Creational.Builder;

public class Builder {
    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        dealer.setCarBuilder(new ToyotaBuilder());
        Car car = dealer.buildCar();
        System.out.println(car.toString());


    }
}
