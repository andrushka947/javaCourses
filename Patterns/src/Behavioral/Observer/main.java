package Behavioral.Observer;

import java.util.ConcurrentModificationException;

public class main {
    public static void main(String[] args) {

        MeteoStation station = new MeteoStation();
        station.addObserver(new Console());
        station.addObserver(new EmailObserver());
        station.setMeasurements(11, 750);
        station.setMeasurements(13  , 762);

    }
}
