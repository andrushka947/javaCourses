package _Exercises.task7_Watch;

public class main {
    public static void main(String[] args) {

        Watch rome = new RomeWatchFactory().createWatch();
        Watch digital = new DigitalWatchFactory().createWatch();
        rome.makeWatch();
        digital.makeWatch();

    }
}
