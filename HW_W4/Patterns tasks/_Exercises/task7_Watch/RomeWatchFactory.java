package _Exercises.task7_Watch;

public class RomeWatchFactory implements WatchFactory{
    @Override
    public RomeWatch createWatch() {
        return new RomeWatch();
    }
}