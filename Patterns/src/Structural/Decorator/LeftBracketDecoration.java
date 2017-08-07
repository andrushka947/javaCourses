package Structural.Decorator;

public class LeftBracketDecoration extends Decorator{
    public LeftBracketDecoration(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("[");
        super.print();
    }
}
