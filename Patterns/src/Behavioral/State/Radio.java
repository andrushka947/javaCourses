package Behavioral.State;

public class Radio {
    Station station;

    public void setStation(Station station) {
        this.station = station;
    }

    void nextStation() {
        if (station instanceof Radio7) {
            setStation(new RadioDFM());
        }
        else if (station instanceof RadioDFM) {
            setStation(new VestFM());
        }
        else if (station instanceof VestFM) {
            setStation(new Radio7());
        }
    }

    void play() {
        station.play();
    }
}
