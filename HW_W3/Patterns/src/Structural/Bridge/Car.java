package Structural.Bridge;

public abstract class Car {

    Model model;

    public Car(Model model) {
        this.model = model;
    }

    abstract void showType();
    void showDetails() {
        showType();
        model.setModel();
    }

}
