package Fundamental.Delegate;

public class Delegate {
    public static void main(String[] args) {

        Painter painter = new Painter();
        painter.setShape(new Triangle());
        painter.draw();

        painter.setShape(new Circle());
        painter.draw();

        painter.setShape(new Square());
        painter.draw();

    }
}
