package Behavioral.Observer;

public interface Observed {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
