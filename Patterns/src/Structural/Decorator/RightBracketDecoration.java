package Structural.Decorator;

public class RightBracketDecoration extends Decorator{
    public RightBracketDecoration(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("]");
    }
}