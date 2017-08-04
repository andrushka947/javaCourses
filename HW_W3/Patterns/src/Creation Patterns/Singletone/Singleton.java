package Singletone;

public class Singleton {
    private static Singleton singleton;
    private static int counter = 0;
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                    counter++;
                }
            }
        }
        return singleton;
    }

    public static int getCounter() {
        return counter;
    }
}
