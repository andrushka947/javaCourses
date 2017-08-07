package Structural.Decorator;

public class main {
    public static void main(String[] args) {
        PrinterInterface print = new QuoteDecorator(
                new RightBracketDecoration(
                        new LeftBracketDecoration(
                                new Printer("Hello")))) ;
         print.print();
    }
}
