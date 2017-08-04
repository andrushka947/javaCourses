package Singletone;

public class main {
    public static void main(String[] args) throws InterruptedException {

        int size = 1000;
        Thread[] threads = new Thread[size];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new R());
            threads[i].run();
        }
        for (int i = 0; i < threads.length; i++) {

            threads[i].join();
        }

        System.out.println(Singleton.getCounter());
    }
}
