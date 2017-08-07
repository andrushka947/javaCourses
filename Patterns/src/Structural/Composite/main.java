package Structural.Composite;

public class main {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        Composite comp1 = new Composite();
        Composite comp2 = new Composite();

        comp1.addComponent(circle);
        comp1.addComponent(square);
        comp2.addComponent(comp1);
        comp2.addComponent(triangle);
        comp2.addComponent(square);
        comp2.draw();
    }
}
