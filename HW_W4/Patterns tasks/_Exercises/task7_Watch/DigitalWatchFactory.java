package _Exercises.task7_Watch;

public class DigitalWatchFactory implements WatchFactory{
    @Override
    public DigitalWatch createWatch() {
        return new DigitalWatch();
    }
}
