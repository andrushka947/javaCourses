package Structural.Decorator;

public class QuoteDecorator extends Decorator{
     public QuoteDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}
