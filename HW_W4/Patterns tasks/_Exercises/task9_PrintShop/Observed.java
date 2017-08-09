package _Exercises.task9_PrintShop;

public interface Observed {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
