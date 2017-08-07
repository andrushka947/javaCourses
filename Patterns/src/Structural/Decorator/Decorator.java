package Structural.Decorator;

public abstract class Decorator implements PrinterInterface {
    PrinterInterface component;

    public Decorator(PrinterInterface component) {
        this.component = component;
    }

    @Override
    public void print() {
        component.print();
    }
}
