package Behavioral.Command;

public class User {
    Command start;
    Command stop;
    Command restart;

    public User(Command start, Command stop, Command restart) {
        this.start = start;
        this.stop = stop;
        this.restart = restart;
    }

    void startComp() {
        start.execute();
    }
    void stopComp() {
        stop.execute();
    }
    void restartComp() {
        restart.execute();
    }

}
