package Creational.Singletone;

public class R implements Runnable {
    @Override
    public void run() {
        Singleton.getInstance();
    }
}
