package _Exercises.task9_PrintShop;

import java.util.ArrayList;
import java.util.List;

public class PrintShop implements Observed{
    private List<String> magazines = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addMagazine(String magazineName) {
        magazines.add(magazineName);
        notifyObserver();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.handleEvent(getLastMagazine());
        }
    }

    private String getLastMagazine() {
        return magazines.get(magazines.size() - 1);
    }
}
